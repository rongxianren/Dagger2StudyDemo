package com.rongxianren.dagger.daggerandroid.di.module;

import com.rongxianren.dagger.daggerandroid.di.Age;

import dagger.Module;
import dagger.Provides;

@Module
public class DaggerAndroidActivityModule {

    @Age
    @Provides
    public int provideAge() {
        return 18;
    }
}
