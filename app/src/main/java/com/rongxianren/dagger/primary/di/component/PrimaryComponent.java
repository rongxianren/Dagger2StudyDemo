package com.rongxianren.dagger.primary.di.component;

import com.rongxianren.dagger.primary.DaggerPrimaryUseActivity;
import com.rongxianren.dagger.primary.di.module.PrimaryModule;

import dagger.Component;

/**
 * Created by tangyun on 2018/12/8.
 */


@Component(modules = {PrimaryModule.class})
public interface PrimaryComponent {

    void inject(DaggerPrimaryUseActivity activity);
}
