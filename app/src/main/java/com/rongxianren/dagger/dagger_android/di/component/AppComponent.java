package com.rongxianren.dagger.dagger_android.di.component;

import com.rongxianren.dagger.dagger_android.app.DaggerAndroidApplication;
import com.rongxianren.dagger.dagger_android.di.module.ActivityBuilderModule;
import com.rongxianren.dagger.dagger_android.di.module.AppModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {ActivityBuilderModule.class, AndroidInjectionModule.class, AppModule.class})
public interface AppComponent {
    void inject(DaggerAndroidApplication application);
}
