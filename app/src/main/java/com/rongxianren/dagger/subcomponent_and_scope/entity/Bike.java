package com.rongxianren.dagger.subcomponent_and_scope.entity;


import com.rongxianren.dagger.subcomponent_and_scope.ActivityScope;

import javax.inject.Inject;

/**
 * Created by tangyun on 2018/12/9.
 */

//@ActivityScope
public class Bike implements ICar {


    @Inject
    public Bike() {
    }

    @Override
    public String run() {
        return "我只是辆自行车，我只能跑20码！！！！";
    }
}
