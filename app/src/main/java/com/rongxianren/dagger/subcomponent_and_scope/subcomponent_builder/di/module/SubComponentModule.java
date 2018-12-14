package com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.module;

import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;
import com.rongxianren.dagger.subcomponent_and_scope.entity.ICar;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module
public class SubComponentModule {

    @Provides
    @Named("bike")
    ICar provideBike() {
        return new Bike();
    }
}
