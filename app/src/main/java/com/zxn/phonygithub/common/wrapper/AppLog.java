package com.zxn.phonygithub.common.wrapper;

import com.orhanobut.logger.Logger;
import com.zxn.phonygithub.BuildConfig;

/**
 * Created by zxn on 17-5-21.
 */
public class AppLog {

    private static final String TAG = "PhonyGithub";

    /**
     * Initialize the logger
     */
    public static void init() {
        Logger.init(TAG);
    }

    /**
     * log.i
     * @param msg
     */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.i(msg);
        }
    }

    /**
     * log.d
     * @param msg
     */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.d(msg);
        }
    }

    /**
     * log.w
     * @param msg
     */
    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.w(msg);
        }
    }

    /**
     * log.e
     * @param msg
     */
    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.e(msg);
        }
    }

    /**
     * log.e
     * @param e
     */
    public static void e(Throwable e) {
        Logger.e(e, "");
    }

}
