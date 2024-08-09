package de.vw.mib.asl.internal.androidauto.target;

import java.lang.reflect.Field;
import java.util.Hashtable;

public class ManeuverDescriptorMainElement {
    public static final int NO_SYMBOL = 0;
    public static final int NO_INFO = 1;
    public static final int DIRECTION_TO_DESTINATION = 2;
    public static final int ARRIVED = 3;
    public static final int NEAR_DESTINATION = 4;
    public static final int ARRIVED_DESTINATION_OFFMAP = 5;
    public static final int OFF_ROAD = 6;
    public static final int OFF_MAP = 7;
    public static final int NO_ROUTE = 8;
    public static final int CALC_ROUTE = 9;
    public static final int RECALC_ROUTE = 10;
    public static final int FOLLOW_STREET = 11;
    public static final int CHANGE_LANE = 12;
    public static final int TURN = 13;
    public static final int TURN_ON_MAINROAD = 14;
    public static final int EXIT_RIGHT = 15;
    public static final int EXIT_LEFT = 16;
    public static final int SERVICE_ROAD_RIGHT = 17;
    public static final int SERVICE_ROAD_LEFT = 18;
    public static final int FORK_2 = 19;
    public static final int FORK_3 = 20;
    public static final int ROUNDABOUT_TRS_RIGHT = 21;
    public static final int ROUNDABOUT_TRS_LEFT = 22;
    public static final int SQUARE_TRS_RIGHT = 23;
    public static final int SQUARE_TRS_LEFT = 24;
    public static final int UTURN = 25;
    public static final int EXIT_ROUNDABOUT_TRS_RIGHT = 26;
    public static final int EXIT_ROUNDABOUT_TRS_LEFT = 27;
    public static final int PREPARE_TURN = 28;
    public static final int PREPARE_ROUNDABOUT = 29;
    public static final int PREPARE_SQUARE = 30;
    public static final int PREPARE_U_TURN = 31;
    public static final int MICHIGANG_TURN = 32;
    public static final int DOUBLE_TURN = 33;
    public static final int DIRECTION_TO_WAYPOINT = 34;

    public static Hashtable createLookup() {
        Hashtable constantsMap = new Hashtable();
            try {
                // Get all declared fields of the class
                Field[] fields = ManeuverDescriptorMainElement.class.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    Field field = fields[i];
                    // Check if the field is public, static, and final
                    if (java.lang.reflect.Modifier.isPublic(field.getModifiers()) &&
                            java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
                            java.lang.reflect.Modifier.isFinal(field.getModifiers()) &&
                            field.getType() == int.class) {
                        // Add the field name and value to the constantsMap
                        constantsMap.put(field.getName(), new Integer(field.getInt(null)));
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


     return constantsMap;
    }

}
