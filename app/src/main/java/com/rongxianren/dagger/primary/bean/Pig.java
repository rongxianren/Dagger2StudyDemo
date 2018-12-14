package com.rongxianren.dagger.primary.bean;


/**
 * Created by tangyun on 2018/12/8.
 */

public class Pig {

    int weight;
    String color;

    public Pig(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return " this pig weight is " + weight + "kg and color is " + color;
    }
}
