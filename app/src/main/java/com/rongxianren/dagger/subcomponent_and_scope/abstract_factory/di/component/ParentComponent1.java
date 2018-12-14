package com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.module.ParentComponentModule1;

import dagger.Component;
import dagger.Module;

/**
 * Created by tangyun on 2018/12/9.
 */

@Component(modules = ParentComponentModule1.class)
public interface ParentComponent1 {
    SubComponent1 getSubComponent();
}
