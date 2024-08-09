package de.vw.mib.asl.internal.androidauto.target;

import org.dsi.ifc.androidauto2.Constants;
import org.dsi.ifc.navigation.BapManeuverDescriptor;

public class NavTurn {
    private int turnSide;
    private int event;
    private int turnAngle;
    private int turnNumber;

    public NavTurn(int turnSide, int event, int turnAngle, int turnNumber) {
        this.turnSide = turnSide;
        this.event = event;
        this.turnAngle = turnAngle;
        this.turnNumber = turnNumber;
    }

    public int getTurnSide() {
        return turnSide;
    }

    public int getEvent() {
        return event;
    }

    public int getTurnAngle() {
        return turnAngle;
    }

    public int getTurnNumber() {
        return turnNumber;
    }


    public BapManeuverDescriptor toManeuverDescriptor() {
        BapManeuverDescriptor maneuverDescriptor = new BapManeuverDescriptor();

        maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.NO_SYMBOL;

        if (event == Constants.NAVIGATIONTURNEVENT_DEPART) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.DIRECTION_TO_DESTINATION;
            maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_SLIGHT_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT_SLIGHT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT_SLIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_SHARP_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.TURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT_SHARP;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT_SHARP;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_ON_RAMP
                || event == Constants.NAVIGATIONTURNEVENT_OFF_RAMP || event == Constants.NAVIGATIONTURNEVENT_MERGE) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.CHANGE_LANE;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            } else {
                // this is for UNSPECIFIED turnSide - I get "MERGE" events with no turnSide
                // using TURN with straight direction because it does show road name in gauge
                // (FOLLOW_STREET shows "current streetname" to follow)
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.TURN;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_STRAIGHT || event == Constants.NAVIGATIONTURNEVENT_NAME_CHANGE) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.TURN;
            maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_FORK) {
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.FORK_2;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.FORK_2;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            } else {
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.FORK_3;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_U_TURN) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.UTURN;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            }
        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_ENTER) {
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.PREPARE_ROUNDABOUT;
            maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_EXIT) {
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.EXIT_ROUNDABOUT_TRS_LEFT;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else {
                maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.EXIT_ROUNDABOUT_TRS_RIGHT;
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            }

        } else if (event == Constants.NAVIGATIONTURNEVENT_ROUNDABOUT_ENTER_AND_EXIT) {
            maneuverDescriptor.mainElement = turnSide == Constants.NAVIGATIONTURNSIDE_LEFT
                    ? ManeuverDescriptorMainElement.ROUNDABOUT_TRS_LEFT
                    : ManeuverDescriptorMainElement.ROUNDABOUT_TRS_RIGHT;
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
            maneuverDescriptor.mainElement = ManeuverDescriptorMainElement.NEAR_DESTINATION;
            maneuverDescriptor.direction = ManeuverDescriptorDirection.STRAIGHT;
            if (turnSide == Constants.NAVIGATIONTURNSIDE_LEFT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.LEFT;
            } else if (turnSide == Constants.NAVIGATIONTURNSIDE_RIGHT) {
                maneuverDescriptor.direction = ManeuverDescriptorDirection.RIGHT;
            }
        }

        return maneuverDescriptor;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the objects are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type

        NavTurn navTurn = (NavTurn) obj;

        if (turnSide != navTurn.turnSide) return false;
        if (event != navTurn.event) return false;
        if (turnAngle != navTurn.turnAngle) return false;
        return turnNumber == navTurn.turnNumber;
    }

    public int hashCode() {
        int result = turnSide;
        result = 31 * result + event;
        result = 31 * result + turnAngle;
        result = 31 * result + turnNumber;
        return result;
    }
}
