package com.rongxianren.dagger.subcomponent_and_scope.dependence.di.module;

import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module
public class SubComponentModule2 {

    @Provides
    Bike provideBikes() {
        return new Bike();
    }
}
