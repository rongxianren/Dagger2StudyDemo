package com.rongxianren.dagger.dagger_android.di.module;

import com.rongxianren.dagger.dagger_android.DaggerAndroidActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {DaggerAndroidActivityModule.class})
    abstract DaggerAndroidActivity bindDaggerAndroidActivity();
}
