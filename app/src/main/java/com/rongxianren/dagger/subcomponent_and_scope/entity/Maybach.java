package com.rongxianren.dagger.subcomponent_and_scope.entity;

import javax.inject.Inject;

/**
 * Created by tangyun on 2018/12/9.
 */

public class Maybach implements ICar {


    @Inject
    public Maybach() {

    }


    @Override
    public String run() {
        return "我是200W的迈巴赫，我可以跑200码！！！";
    }
}
