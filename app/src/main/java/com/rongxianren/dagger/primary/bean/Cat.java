package com.rongxianren.dagger.primary.bean;

import com.rongxianren.dagger.primary.di.DogAge;
import com.rongxianren.dagger.primary.di.DogColor;

import javax.inject.Inject;

/**
 * Created by tangyun on 2018/12/8.
 */

public class Cat {

    private String color;
    private int age;

    @Inject
    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }


    @Override
    public String toString() {
        return "this cat color is " + color + " age is " + age;
    }
}
