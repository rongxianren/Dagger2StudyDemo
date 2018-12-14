package com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.component;

import com.rongxianren.dagger.MainActivity;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.inter.ActivityComponentBuilder;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.inter.ActivityInjector;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.ActivityScopde;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.module.ActivityModule;

import dagger.Subcomponent;

@ActivityScopde
@Subcomponent(modules = ActivityModule.class)
public interface MainActivityComponent extends ActivityInjector<MainActivity> {
    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<MainActivityComponent> {
    }
}
