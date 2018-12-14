package com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.module;

import com.rongxianren.dagger.subcomponent_and_scope.ActivityScope;
import com.rongxianren.dagger.subcomponent_and_scope.entity.ICar;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Maybach;
import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.component.SubComponent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/9.
 */

@Module(subcomponents = SubComponent.class)
public class ParentComponentModule {

    @Provides
    @ActivityScope
    ICar provideBenz() {
        return new Maybach();
    }
}
