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
}
