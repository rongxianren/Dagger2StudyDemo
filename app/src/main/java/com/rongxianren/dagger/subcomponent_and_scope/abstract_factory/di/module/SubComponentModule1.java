package com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.module;

import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module
public class SubComponentModule1 {

    @Provides
    Bike provideBike() {
        return new Bike();
    }
}
