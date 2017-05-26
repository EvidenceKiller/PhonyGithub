package com.zxn.phonygithub.di.component;

import android.content.Context;

import com.zxn.phonygithub.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zxn on 17-5-26.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();


}
