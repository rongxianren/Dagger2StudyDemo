package com.rongxianren.dagger.daggerandroid.di.module;

import com.rongxianren.dagger.daggerandroid.DaggerAndroidActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {DaggerAndroidActivityModule.class})
    abstract DaggerAndroidActivity bindDaggerAndroidActivity();
}
