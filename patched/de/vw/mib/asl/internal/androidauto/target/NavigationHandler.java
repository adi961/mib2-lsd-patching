package de.vw.mib.asl.internal.androidauto.target;

import de.vw.mib.asl.api.navbap.ASLNavBAPFactory;
import de.vw.mib.asl.framework.internal.framework.GenericCollector;
import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.bap.mqbab2.common.api.APIFactory;
import de.vw.mib.bap.mqbab2.common.api.navigation.NavigationASLDataAdapter;
import generated.de.vw.mib.asl.internal.ListManager;
import org.dsi.ifc.androidauto2.Constants;
import org.dsi.ifc.navigation.BapManeuverDescriptor;

import java.util.Vector;

public class NavigationHandler {
    private static final int bargraphShowThreshold = 200;

    private BapManeuverDescriptor nextBapManeuverDescriptor;
    private BapManeuverDescriptor currentBapManeuverDescriptor;
    private boolean isFollowRoad = false;


    public NavigationHandler() {}

    public void navigationFocus(int focus) {
        switch (focus) {
            case Constants.NAVFOCUS_NATIVE: {
                navStopped();
            }
            case Constants.NAVFOCUS_PROJECTED: {
                navStarted();
            }
        }

        // set android auto navigation active
        ServiceManager.aslPropertyManager.valueChangedBoolean(895953920, true);

        NavigationASLDataAdapter adapter = (NavigationASLDataAdapter) APIFactory.getAPIFactory().getNavigationService();
        adapter.datapoolValueChanged(733);
    }

    private void navStopped() {
        nextBapManeuverDescriptor = null;
        currentBapManeuverDescriptor = null;
    }

    private void navStarted() {

    }

    private static char[] bytesToCharacters(byte[] byArray) {
        int n = byArray.length;
        char[] cArray = new char[n];
        for (int i2 = 0; i2 < n; ++i2) {
            cArray[i2] = (char) (byArray[i2] & 0xFF);
        }
        return cArray;
    }

    public void handleNextTurnEvent(String road, int turnSide, int event, int turnAngle, int turnNumber) {
        ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo(road, "");

        if (event == Constants.NAVIGATIONTURNEVENT_UNKNOWN) {
            return;
        }

        nextBapManeuverDescriptor = makeManeuverDescriptor(turnSide, event, turnAngle, turnNumber);
    }

    private BapManeuverDescriptor makeManeuverDescriptor(int turnSide, int event, int turnAngle, int turnNumber) {
        BapManeuverDescriptor maneuverDescriptor = new BapManeuverDescriptor();
        maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_NO_SYMBOL;

        if(event == Constants.NAVIGATIONTURNEVENT_DEPART) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_DIRECTION_TO_DESTINATION;
            maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_SLIGHT_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT_SLIGHT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT_SLIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_SHARP_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT_SHARP;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT_SHARP;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_ON_RAMP
                || event == Constants.NAVIGATIONTURNEVENT_OFF_RAMP || event == Constants.NAVIGATIONTURNEVENT_MERGE) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_CHANGE_LANE;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            } else {
                // this is for UNSPECIFIED turnSide - I get "MERGE" events with no turnSide
                // using TURN with straight direction because it does show road name in gauge
                // (FOLLOW_STREET shows "current streetname" to follow)
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_TURN;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_STRAIGHT || event == Constants.NAVIGATIONTURNEVENT_NAME_CHANGE) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_TURN;
            maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_FORK) {
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_FORK_2;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_FORK_2;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            } else {
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_FORK_3;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_U_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_UTURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_ENTER) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_PREPARE_ROUNDABOUT;
            maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_EXIT) {
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_EXIT_ROUNDABOUT_TRS_LEFT;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else {
                maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_EXIT_ROUNDABOUT_TRS_RIGHT;
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            }

        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_ENTER_AND_EXIT) {
            maneuverDescriptor.mainElement = turnSide == Constants.NAVIGATIONTURNSIDE_LEFT
                    ? ManeuverDescriptor.MAIN_ELEMENT_ROUNDABOUT_TRS_LEFT
                    : ManeuverDescriptor.MAIN_ELEMENT_ROUNDABOUT_TRS_RIGHT;
            // Android "right" through roundabout is 90 maps to VW 192
            // Android "straight" through roundabout is 180 maps to VW 0
            // Android "left" through roundabout is 270 maps to VW 64
            // Android "uturn" through roundabout is 360 maps to VW 128

            // Android range from 0-360, VW range from 0-256
            // Seems like VW supports increments of 16 (0, 16, 32, 48, 64, and so on)
            // possibly more, but that's detailed enough.

            maneuverDescriptor.direction = ((((180 + (360 / (16 * 2)) + turnAngle) % 360) * 16) / 360)
                    * 16;
        } else if (event == Constants.NAVIGATIONTURNEVENT_DESTINATION) {
            maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_NEAR_DESTINATION;
            maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_RIGHT;
            }
        }

        return maneuverDescriptor;

    }

    private void updateManeuverDescriptor(BapManeuverDescriptor[] bapManeuverDescriptorArray) {
        BapManeuverDescriptor[] bapManeuverDescriptorArray2 = bapManeuverDescriptorArray;
        if (bapManeuverDescriptorArray2 == null || bapManeuverDescriptorArray2.length == 0) {
            bapManeuverDescriptorArray2 = new BapManeuverDescriptor[]{new BapManeuverDescriptor(0, 0, 0, new byte[0])};
        }

        Vector object = new Vector();
        GenericCollector[] genericCollectorArray = new GenericCollector[bapManeuverDescriptorArray2.length];
        for (int i3 = 0; i3 < bapManeuverDescriptorArray2.length; ++i3) {
            GenericCollector genericCollector = new GenericCollector();
            genericCollector.setIntItem(0, bapManeuverDescriptorArray2[i3].getMainElement());
            genericCollector.setIntItem(1, bapManeuverDescriptorArray2[i3].getDirection());
            genericCollector.setIntItem(2, bapManeuverDescriptorArray2[i3].getZLevelGuidance());
            String string = "";
            byte[] byArray = bapManeuverDescriptorArray2[i3].getSideStreets();
            if (byArray != null) {
                string = new String(NavigationHandler.bytesToCharacters(byArray));
            }
            genericCollector.setStringItem(3, string);
            ((Vector) object).add(genericCollector);
            genericCollectorArray[i3] = genericCollector;
        }
        ListManager.getGenericASLList(751).updateList(genericCollectorArray);
        ListManager.getGenericASLList(838).updateList(genericCollectorArray);
    }

    public void handleUpdateNextTurnDistanceEvent(int distanceMeters, int timeSeconds) {
        int roundedDistance = roundDistance(distanceMeters);
        System.out.println("AADEBUG: distanceMeters: " + distanceMeters + " timeSeconds: " + timeSeconds + " roundedDistance: " + roundedDistance);

        if ((nextBapManeuverDescriptor.mainElement == Constants.NAVIGATIONTURNEVENT_OFF_RAMP & timeSeconds <= 180) || distanceMeters <= 200) {
            flushNextManeuverDescriptor();
        }else {
            sendFollowRoadManeuverDescriptor();
        }


        int unit = roundedDistance < 1000 ? 0 : 1;
        int bargraph = 0;
        boolean bargraphOn = false;

        if (distanceMeters <= bargraphShowThreshold) {
            bargraphOn = true;
            // bargraph seems to start with 100 (fully filled) and go down to 0 (empty)
            // so we just scale distance based on threshold
            bargraph = (distanceMeters * 100)
                    / bargraphShowThreshold;
        }

        ASLNavBAPFactory.getNavBAPApi().updateBapDistanceToNextManeuver(roundedDistance, unit, bargraphOn, bargraph);
    }

    private int roundDistance(int distanceMeters) {
        if (distanceMeters >= 10000) {
            // above 10km round to nearest 1km
            // (this is just a guess at this point, as I didn't been on a trip with long
            // enough distanceMeters to next manuever to see when Google Maps rounds to nearest
            // 1km, but random screenshots seem to indicate that it does round to 1km at
            // certain threshold)
            return ((distanceMeters + 500) / 1000) * 1000;
        }

        if (distanceMeters >= 1000) {
            // above 1km round to nearest 0.1 kilometers
            return ((distanceMeters + 50) / 100) * 100;
        }

        if (distanceMeters >= 500) {
            // above 500m round to nearest 50 meters
            return ((distanceMeters + 25) / 50) * 50;
        }

        // round to nearest 10 meters
        return ((distanceMeters + 5) / 10) * 10;
    }

    private void flushNextManeuverDescriptor() {
        if (nextBapManeuverDescriptor == null) {
            System.out.println("AADEBUG: no nextManeuver found");
            return;
        }

        if (currentBapManeuverDescriptor != null && currentBapManeuverDescriptor.toString() ==  nextBapManeuverDescriptor.toString()) {
            System.out.println("AADEBUG: no nextManeuver update");
            return;
        }

        updateManeuverDescriptor(new BapManeuverDescriptor[]{nextBapManeuverDescriptor});
        /*  NavigationASLDataAdapter adapter = (NavigationASLDataAdapter) APIFactory.getAPIFactory().getNavigationService();
        adapter.navServiceStateChanged();*/

        isFollowRoad = false;
        currentBapManeuverDescriptor = nextBapManeuverDescriptor;
    }

    private void sendFollowRoadManeuverDescriptor() {
        if (isFollowRoad) {
            System.out.println("AADEBUG: follow road");
            return;
        }

        BapManeuverDescriptor maneuverDescriptor = new BapManeuverDescriptor();
        maneuverDescriptor.mainElement = ManeuverDescriptor.MAIN_ELEMENT_FOLLOW_STREET;
        maneuverDescriptor.direction = ManeuverDescriptor.DIRECTION_STRAIGHT;

        updateManeuverDescriptor(new BapManeuverDescriptor[]{nextBapManeuverDescriptor});
        isFollowRoad = true;
    }
}
