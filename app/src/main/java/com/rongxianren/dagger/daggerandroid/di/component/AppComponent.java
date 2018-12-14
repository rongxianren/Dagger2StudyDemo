package com.rongxianren.dagger.daggerandroid.di.component;

import com.rongxianren.dagger.daggerandroid.app.DaggerAndroidApplication;
import com.rongxianren.dagger.daggerandroid.di.module.ActivityBuilderModule;
import com.rongxianren.dagger.daggerandroid.di.module.AppModule;
import com.rongxianren.dagger.daggerandroid.di.module.DaggerAndroidActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {ActivityBuilderModule.class, AndroidInjectionModule.class, AppModule.class})
public interface AppComponent {
    void inject(DaggerAndroidApplication application);
}
