package com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.ActivityScope;
import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.module.ParentComponentModule;

import dagger.Component;

/**
 * Created by tangyun on 2018/12/9.
 */

@ActivityScope
@Component(modules = ParentComponentModule.class)
public interface ParentComponent {
    SubComponent.Builder getSubComponentBuilder();

}
