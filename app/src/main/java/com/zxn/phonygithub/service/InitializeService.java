package com.zxn.phonygithub.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.zxn.phonygithub.common.wrapper.AppLog;

/**
 * Created by zxn on 17-8-16.
 */

public class InitializeService extends IntentService {

    private static final String TAG = InitializeService.class.getSimpleName();

    private static final String ACTION_INIT_WHEN_CREATE = "com.zxn.phonygithub.service.action.INIT_WHEN_APP_CREATE";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public InitializeService() {
        super(TAG);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, InitializeService.class);
        intent.setAction(ACTION_INIT_WHEN_CREATE);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (null != intent && ACTION_INIT_WHEN_CREATE.equals(intent.getAction())) {
            performInit();
        }
    }

    private void performInit() {
        AppLog.d(TAG + "------performInit begin : process : " + android.os.Process.myPid() + ", thread : " + android.os.Process.myTid());

        // TODO
    }
}
