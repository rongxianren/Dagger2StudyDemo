package com.rongxianren.dagger.subcomponent_and_scope.dependence.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.dependence.DependenceActivity;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.di.module.SubComponentModule2;

import dagger.Component;

/**
 * Created by tangyun on 2018/12/9.
 */
@Component(dependencies = ParentComponent2.class, modules = SubComponentModule2.class)
public interface SubComponent2 {
    void inject(DependenceActivity activity);
}
