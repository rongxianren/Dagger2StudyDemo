package com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.module;

import com.rongxianren.dagger.MainActivity;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.inter.ActivityComponentBuilder;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.MultiBinddingActivity;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.component.MainActivityComponent;
import com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.component.MultiBindingActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {MultiBindingActivityComponent.class, MainActivityComponent.class})
public abstract class ActivityBuilderModule {
    @Binds
    @IntoMap
    @ActivityKey(MultiBinddingActivity.class)
    public abstract ActivityComponentBuilder
    bindMultiActivityBuidler(MultiBindingActivityComponent.Builder builder);


    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    public abstract ActivityComponentBuilder
    bindMainActivityBuidler(MainActivityComponent.Builder builder);
}
