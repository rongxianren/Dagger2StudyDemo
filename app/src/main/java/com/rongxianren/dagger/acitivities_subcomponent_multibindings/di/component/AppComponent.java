package com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.component;


import com.rongxianren.dagger.acitivities_subcomponent_multibindings.app.MyApplication;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.module.ActivityBuilderModule;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.module.AppModule;

import dagger.Component;

@Component(modules = {ActivityBuilderModule.class, AppModule.class})
public interface AppComponent {
    void inject(MyApplication myApplication);
}
