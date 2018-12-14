package com.rongxianren.dagger.subcomponent_and_scope.depenences.di.module;

import com.rongxianren.dagger.subcomponent_and_scope.entity.Maybach;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module
public class ParentComponentModule2 {

    @Provides
    Maybach provideMaybach() {
        return new Maybach();
    }
}
