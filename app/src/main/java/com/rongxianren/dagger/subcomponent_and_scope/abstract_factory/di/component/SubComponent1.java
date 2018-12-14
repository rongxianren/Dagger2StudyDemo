package com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.SubComponentActivity1;
import com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.module.SubComponentModule1;

import dagger.Subcomponent;

/**
 * Created by tangyun on 2018/12/9.
 */
@Subcomponent(modules = SubComponentModule1.class)
public interface SubComponent1 {

    void inject(SubComponentActivity1 activity1);
}
