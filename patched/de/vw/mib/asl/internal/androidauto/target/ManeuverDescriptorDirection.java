package de.vw.mib.asl.internal.androidauto.target;

import java.lang.reflect.Field;
import java.util.Hashtable;

public class ManeuverDescriptorDirection {
    public static final int STRAIGHT = 0;
    public static final int LEFT_SLIGHT = 32;
    public static final int LEFT = 64;
    public static final int LEFT_SHARP = 96;
    public static final int RIGHT_SHARP = 160;
    public static final int RIGHT = 192;
    public static final int RIGHT_SLIGHT = 224;

    public static Hashtable createLookup() {
        Hashtable constantsMap = new Hashtable();
        try {
            // Get all declared fields of the class
            Field[] fields = ManeuverDescriptorDirection.class.getDeclaredFields();
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
