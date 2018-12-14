package com.rongxianren.dagger.component_builder.di.component;

import android.app.Application;

import com.rongxianren.dagger.component_builder.ComponentBuilderActivity;
import com.rongxianren.dagger.component_builder.di.module.ComponentBuilderModule;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by tangyun on 2018/12/9.
 */

@Component(modules = {ComponentBuilderModule.class})
public interface ComponentBuilderComponent {

    void inject(ComponentBuilderActivity activity);


//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder application(Application application);
//
//        ComponentBuilderComponent build();
//
//        /**
//         * 如果Module除了 Application还有其他参数要传入 必须在这上下面这个方法
//         */
////        Builder module( ComponentBuilderModule componentBuilderModule);
//    }
}
