package com.rongxianren.dagger.primary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.primary.bean.Cat;
import com.rongxianren.dagger.primary.bean.Dog;
import com.rongxianren.dagger.primary.bean.Horse;
import com.rongxianren.dagger.primary.bean.Pig;
import com.rongxianren.dagger.primary.di.component.DaggerPrimaryComponent;

import javax.inject.Inject;

/**
 * 这里主要是介绍
 * Dagger 基本的注入方式
 * 以及常用的一些注解标签的作用以及用法
 */

public class DaggerPrimaryUseActivity extends AppCompatActivity {

    /**
     * Dog 和 Horse是通过构造函数的形式注入的
     */
    @Inject
    Dog mDog;

    @Inject
    Horse mHorse;


    /**
     * Pig和Cat是通过Module方式注入的
     */
    @Inject
    Pig mPig;

    @Inject
    Cat mCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_primary_use);

        /**
         * inject(params)
         * params必须是具体的的
         * 类型不能是他的父类
         */
        DaggerPrimaryComponent.builder().build()
                .inject(this);

        System.out.println("DaggerPrimaryUseActivity---" + mDog);
        System.out.println("DaggerPrimaryUseActivity---" + mPig);
        System.out.println("DaggerPrimaryUseActivity---" + mHorse);
        System.out.println("DaggerPrimaryUseActivity---" + mCat);

    }
}
