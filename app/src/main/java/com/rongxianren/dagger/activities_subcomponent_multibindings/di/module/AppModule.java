package com.rongxianren.dagger.activities_subcomponent_multibindings.di.module;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    public int getVersionCode() {
        return 11;
    }
}
