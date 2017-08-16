package com.zxn.phonygithub.di.module;

import android.app.Application;
import android.content.Context;

import com.zxn.phonygithub.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zxn on 17-8-6.
 */
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

}
