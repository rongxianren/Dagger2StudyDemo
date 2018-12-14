package com.rongxianren.dagger.component_builder.di.module;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module
public class ComponentBuilderModule {

    private Application mApplication;

    public ComponentBuilderModule(Application mApplication) {
        this.mApplication = mApplication;
    }


//    @Provides
//    SharedPreferences provideSharePreferences(Application application) {
//        return application.getSharedPreferences("my_share", Context.MODE_PRIVATE);
//    }

    @Provides
    SharedPreferences provideSharePreferences() {
        return mApplication.getSharedPreferences("my_share", Context.MODE_PRIVATE);
    }
}


