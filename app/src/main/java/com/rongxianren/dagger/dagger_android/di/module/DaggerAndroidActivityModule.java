package com.rongxianren.dagger.dagger_android.di.module;

import com.rongxianren.dagger.dagger_android.di.Age;

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
