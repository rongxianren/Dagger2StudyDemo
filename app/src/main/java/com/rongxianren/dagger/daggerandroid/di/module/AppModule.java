package com.rongxianren.dagger.daggerandroid.di.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Named("versionCode")
    @Provides
    public int provideVersionCode() {
        return 2;
    }
}
