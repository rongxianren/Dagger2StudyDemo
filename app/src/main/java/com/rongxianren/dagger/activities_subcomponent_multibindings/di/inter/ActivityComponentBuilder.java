package com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter;

//extends ActivityModule
public interface ActivityComponentBuilder<C extends ActivityInjector> {
    C build();
}
