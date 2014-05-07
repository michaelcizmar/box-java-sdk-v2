package com.box.boxjavalibv2.utils;

public final class LogUtils {

    private static final boolean DEBUG = true;

    /**
     * Private constructor so the class cannot be instantiated.
     */
    private LogUtils() {

    }

    public static void printStackTrace(final Exception e) {
        if (DEBUG) {
            e.printStackTrace();
        }
    }

}
