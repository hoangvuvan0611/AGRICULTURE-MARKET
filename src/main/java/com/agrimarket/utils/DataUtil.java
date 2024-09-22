package com.agrimarket.utils;

public class DataUtil {
    public static boolean isEmptyOrNull(Object o) {
        if(o == null) {
            return true;
        } else return o.toString().trim().isEmpty();
    }

    public static boolean isNullObject(Object o) {
        return o == null;
    }

    public static Long safeToLong(Object o) {
        if(isNullObject(o)) {
            return 0L;
        }
        return Long.parseLong(o.toString());
    }

    public static Double safeToDouble(Object o) {
        if(isNullObject(o)) {
            return 0D;
        }
        return Double.parseDouble(o.toString());
    }

    public static Float safeToFloat(Object o) {
        if(isNullObject(o)) {
            return 0F;
        }
        return Float.parseFloat(o.toString());
    }

    public static Integer safeToInt(Object o) {
        if(isNullObject(o)) {
            return 0;
        }
        return Integer.parseInt(o.toString());
    }

    public static Boolean safeToBoolean(Object o) {
        if(isNullObject(o)) {
            return false;
        }
        return Boolean.parseBoolean(o.toString());
    }

    public static String safeToString(Object o) {
        if(isNullObject(o)) {
            return "";
        }
        return o.toString();
    }
}
