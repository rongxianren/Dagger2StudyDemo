package com.rongxianren.dagger.primary.bean;

import javax.inject.Inject;


/**
 * Created by tangyun on 2018/12/8.
 */

public class Horse {


    @Inject
    public Horse() {
    }


    @Override
    public String toString() {
        return "iam is the fast horse in the world";
    }
}
