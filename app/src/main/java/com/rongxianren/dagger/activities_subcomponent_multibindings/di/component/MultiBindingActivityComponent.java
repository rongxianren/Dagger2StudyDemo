package com.rongxianren.dagger.activities_subcomponent_multibindings.di.component;

import com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter.ActivityComponentBuilder;
import com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter.ActivityInjector;
import com.rongxianren.dagger.activities_subcomponent_multibindings.ActivityScopde;
import com.rongxianren.dagger.activities_subcomponent_multibindings.MultiBinddingActivity;
import com.rongxianren.dagger.activities_subcomponent_multibindings.di.module.ActivityModule;

import dagger.Subcomponent;

@ActivityScopde
@Subcomponent(modules = ActivityModule.class)
public interface MultiBindingActivityComponent extends ActivityInjector<MultiBinddingActivity> {
    @Subcomponent.Builder
    interface Builder extends ActivityComponentBuilder<MultiBindingActivityComponent> {
    }
}
