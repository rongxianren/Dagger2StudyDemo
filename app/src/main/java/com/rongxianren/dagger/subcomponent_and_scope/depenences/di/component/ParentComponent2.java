package com.rongxianren.dagger.subcomponent_and_scope.depenences.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.depenences.di.module.ParentComponentModule2;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Maybach;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by tangyun on 2018/12/9.
 */
@Component(modules = ParentComponentModule2.class)
public interface ParentComponent2 {

    /**
     * 显示的提供实例依赖
     */

    Maybach maybach();
}
