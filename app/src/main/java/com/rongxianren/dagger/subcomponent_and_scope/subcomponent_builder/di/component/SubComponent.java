package com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.component;

import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.SubComponentBuilderActivity;
import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.module.SubComponentModule;

import dagger.Subcomponent;

/**
 * Created by tangyun on 2018/12/9.
 */

@Subcomponent(modules = SubComponentModule.class)
public interface SubComponent {

    void inject(SubComponentBuilderActivity activity);

    @Subcomponent.Builder
    interface Builder {
        SubComponent build();
    }
}
