package de.vw.mib.asl.internal.androidauto.target;

import de.vw.mib.asl.api.navbap.ASLNavBAPFactory;
import de.vw.mib.asl.framework.internal.framework.GenericCollector;
import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.bap.mqbab2.common.api.APIFactory;
import de.vw.mib.bap.mqbab2.common.api.navigation.NavigationASLDataAdapter;
import generated.de.vw.mib.asl.internal.ListManager;
import org.dsi.ifc.androidauto2.Constants;
import org.dsi.ifc.navigation.BapManeuverDescriptor;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class NavigationHandler {
    private static final int bargraphShowThreshold = 200;

    private NavTurn nextTurn;
    private boolean isFollowRoad = false;


    public NavigationHandler() {
    }

    public void navigationFocus(int focus) {
        NavigationASLDataAdapter adapter = (NavigationASLDataAdapter) APIFactory.getAPIFactory().getNavigationService();
        adapter.datapoolValueChanged(733); // Navigation status id

        switch (focus) {
            case Constants.NAVFOCUS_NATIVE: {
                navStopped();
            }
            case Constants.NAVFOCUS_PROJECTED: {
                navStarted();
            }
        }

    }

    private void navStopped() {
        nextTurn = null;
        ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo("", "");
    }

    private void navStarted() {
        nextTurn = null;
        ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo("", "");
    }

    public void handleNextTurnEvent(String road, int turnSide, int event, int turnAngle, int turnNumber) {
        ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo(road, "");

        if (event == Constants.NAVIGATIONTURNEVENT_UNKNOWN) {
            return;
        }

        nextTurn = new NavTurn(turnSide, event, turnAngle, turnNumber);
    }

    public void handleUpdateNextTurnDistanceEvent(int distanceMeters, int timeSeconds) {
        System.out.println("AADEBUG: distanceMeters: " + distanceMeters + " timeSeconds: " + timeSeconds);
        sendManeuver(distanceMeters, timeSeconds);

        int unit = distanceMeters < 1000 ? 0 : 1;
        int bargraph = 0;
        boolean bargraphOn = false;

        if (distanceMeters <= bargraphShowThreshold) {
            bargraphOn = true;
            // set bargraph between 0 and 100
            bargraph = (distanceMeters * 100) / bargraphShowThreshold;
        }

        ASLNavBAPFactory.getNavBAPApi().updateBapDistanceToNextManeuver(distanceMeters, unit, bargraphOn, bargraph);
    }

    private void sendManeuver(int distanceMeters, int timeSeconds) {
        if (nextTurn != null && nextTurn.getEvent() == Constants.NAVIGATIONTURNEVENT_OFF_RAMP && timeSeconds <= 180) {
            sendNextManeuverDescriptor();
            return;
        }

        if (nextTurn != null && distanceMeters <= 200) {
            sendNextManeuverDescriptor();
            return;
        }

        sendFollowRoadManeuverDescriptor();
    }

    private void sendNextManeuverDescriptor() {
        if (nextTurn == null) {
            System.out.println("AADEBUG: no nextManeuver found");
            return;
        }

       /* if (currentTurn != null && currentTurn.equals(nextTurn)) {
            System.out.println("AADEBUG: no nextManeuver update");
            return;
        }*/

        sendManeuverDescriptor(new BapManeuverDescriptor[]{nextTurn.toManeuverDescriptor()});
        isFollowRoad = false;
    }

    private void sendFollowRoadManeuverDescriptor() {
        if (isFollowRoad) {
            System.out.println("AADEBUG: follow road");
            return;
        }

        BapManeuverDescriptor maneuverDescriptor = new BapManeuverDescriptor();
        maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.FOLLOW_STREET;
        maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;

        sendManeuverDescriptor(new BapManeuverDescriptor[]{maneuverDescriptor});
        isFollowRoad = true;
    }

    private void sendManeuverDescriptor(BapManeuverDescriptor[] bapManeuverDescriptorArray) {
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

    private static char[] bytesToCharacters(byte[] byArray) {
        int n = byArray.length;
        char[] cArray = new char[n];
        for (int i2 = 0; i2 < n; ++i2) {
            cArray[i2] = (char) (byArray[i2] & 0xFF);
        }
        return cArray;
    }


    class Tester extends Thread {
        public void testElements() {
            System.out.println("AADEBUG: testElements");
            ServiceManager.aslPropertyManager.valueChangedBoolean(895953920, true);

            NavigationASLDataAdapter adapter = (NavigationASLDataAdapter) APIFactory.getAPIFactory().getNavigationService();
            adapter.datapoolValueChanged(733); // Navigation status id

            Hashtable mainElementLookup = ManeuverDescriptorMainElement.createLookup();
            Enumeration keys =  mainElementLookup.keys();

            Hashtable directionLookup = ManeuverDescriptorDirection.createLookup();

            System.out.println("AADEBUG: start Test");
            while (keys.hasMoreElements()) {
                // Get the next key
                String mainElementKey = (String) keys.nextElement();
                // Get the corresponding value
                Integer mainElementValue = (Integer) mainElementLookup.get(mainElementKey);
                Enumeration dirKeys =  directionLookup.keys();

                while (dirKeys.hasMoreElements()) {
                    String directionKey = (String) dirKeys.nextElement();
                    Integer directionValue = (Integer) directionLookup.get(directionKey);

                    ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo(mainElementValue.toString(), directionValue.toString());

                    BapManeuverDescriptor maneuverDescriptor = new BapManeuverDescriptor();
                    maneuverDescriptor.mainElement = mainElementValue.intValue();
                    maneuverDescriptor.direction = directionValue.intValue();

                    System.out.println("AADEBUG: navTest: " + mainElementKey + ": " + mainElementValue + " - " + directionKey + ": " + directionValue);

                    System.out.println("AADEBUG: " + maneuverDescriptor.toString());

                    sendManeuverDescriptor(new BapManeuverDescriptor[]{maneuverDescriptor});

                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }                }

                ASLNavBAPFactory.getNavBAPApi().updateBapTurnToInfo("Done", "");

            }
        }
        public void run() {
            this.testElements();
        }
    }

}
