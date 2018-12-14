package com.rongxianren.dagger.mapmultibindings;

import java.util.Map;

import dagger.Component;

@Component(modules = MyModules.class)
public interface MyComponent {
    Map<String, Long> longsByString();

    Map<Class<?>, String> stringByClass();

    void inject(MapBindingsActivity activity);
}
