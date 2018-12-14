package com.rongxianren.dagger.primary.bean;

import com.rongxianren.dagger.primary.di.DogAge;
import com.rongxianren.dagger.primary.di.DogColor;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * Created by tangyun on 2018/12/8.
 */

public class Dog {

    private String color;
    private int age;

    @Inject
    public Dog(@Named("dog") String color, @Named("dog") int age) {
        this.color = color;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog color is " + color + " and age is " + age;
    }
}
