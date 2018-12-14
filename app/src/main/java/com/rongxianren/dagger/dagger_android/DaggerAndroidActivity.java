package com.rongxianren.dagger.dagger_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.dagger_android.di.Age;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;

/**
 * 注意要切换应用的Application 为 DaggerAndroidApplication
 */

public class DaggerAndroidActivity extends AppCompatActivity {

    @Named("versionCode")
    @Inject
    int versionCode;

    @Age
    @Inject
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_android);
        AndroidInjection.inject(this);

        System.out.println("--- DaggerAndroidActivity --- vresionCode = " + versionCode);

        
        System.out.println("--- DaggerAndroidActivity --- age = " + age);
    }
}
