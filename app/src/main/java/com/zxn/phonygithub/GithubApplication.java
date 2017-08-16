package com.zxn.phonygithub;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.zxn.phonygithub.common.wrapper.AppLog;
import com.zxn.phonygithub.di.module.ApplicationModule;
import com.zxn.phonygithub.service.InitializeService;

/**
 * Created by zxn on 17-8-16.
 */

public class GithubApplication extends MultiDexApplication {

    public ApplicationModule mApplicationModule;

    @Override
    public void onCreate() {
        super.onCreate();

        AppLog.init();

        InitializeService.start(this);
    }

    public static GithubApplication get(Context context) {
        return (GithubApplication) context.getApplicationContext();
    }


}
