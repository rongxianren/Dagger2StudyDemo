package com.rongxianren.dagger.primary.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by tangyun on 2018/12/8.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface DogAge {
}
