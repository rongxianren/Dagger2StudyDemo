package com.rongxianren.dagger.primary.di.module;

import com.rongxianren.dagger.primary.bean.Pig;
import com.rongxianren.dagger.primary.di.DogAge;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tangyun on 2018/12/8.
 */

@Module
public class PrimaryModule {


    @Provides
    Pig providesPig() {
        return new Pig(100, "black");
    }


    @Provides
    int provideAge() {
        return 1;
    }


    @Provides
    String provideColor() {
        return " common Black";
    }


    //            @DogAge
    @Provides
    @Named("dog")
    int provideDogAge() {
        return 3;
    }

    //    @DogColor
    @Provides
    @Named("dog")
    String provideDogColor() {
        return "Yello";
    }
}
