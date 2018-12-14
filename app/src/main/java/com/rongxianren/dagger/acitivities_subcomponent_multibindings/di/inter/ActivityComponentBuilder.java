package com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.inter;

//extends ActivityModule
public interface ActivityComponentBuilder<C extends ActivityInjector> {
    C build();
}
