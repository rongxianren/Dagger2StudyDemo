package com.rongxianren.dagger.mapmultibindings;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class MyModules {
    @Provides
    @IntoMap
    @StringKey("foo")
    static Long provideFooValue() {
        return 100L;
    }

    @Provides
    @IntoMap
    @StringKey("foo1")
    static Long provideFoo1Value() {
        return 200L;
    }

    @Provides
    @IntoMap
    @StringKey("foo2")
    static Long provideFoo2Value() {
        return 300L;
    }

    @Provides
    @IntoMap
    @ClassKey(MapBindingsActivity.class)
    static String provideTestClassValue() {
        return "value for TestClass";
    }
}
