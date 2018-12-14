package com.rongxianren.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rongxianren.dagger.activities_subcomponent_multibindings.MultiBinddingActivity;
import com.rongxianren.dagger.activities_subcomponent_multibindings.app.MyApplication;
import com.rongxianren.dagger.component_builder.ComponentBuilderActivity;
import com.rongxianren.dagger.dagger_android.DaggerAndroidActivity;
import com.rongxianren.dagger.mapmultibindings.MapBindingsActivity;
import com.rongxianren.dagger.primary.DaggerPrimaryUseActivity;
import com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.SubComponentActivity1;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.DependenceActivity;
import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.SubComponentBuilderActivity;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    int versionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        injectMember();
        System.out.println("--- MainActivity --- versionCode = " + versionCode);
    }

    void injectMember() {
        MyApplication.get(this).getActivityComponentBuilder(MainActivity.class)
                .build().injectMembers(this);
    }

    public void primaryUse(View view) {
        Intent intent = new Intent(this, DaggerPrimaryUseActivity.class);
        startActivity(intent);
    }

    public void componentBuildre(View view) {
        Intent intent = new Intent(this, ComponentBuilderActivity.class);
        startActivity(intent);
    }

    public void subcomponentBuilder(View view) {
        Intent intent = new Intent(this, SubComponentBuilderActivity.class);
        startActivity(intent);
    }

    public void subcomponentAbstractFactory(View view) {
        Intent intent = new Intent(this, SubComponentActivity1.class);
        startActivity(intent);
    }

    public void dependenceActivity(View view) {
        Intent intent = new Intent(this, DependenceActivity.class);
        startActivity(intent);
    }

    public void mapBindings(View view) {
        Intent intent = new Intent(this, MapBindingsActivity.class);
        startActivity(intent);
    }

    public void activityMultiBindings(View view) {
        Intent intent = new Intent(this, MultiBinddingActivity.class);
        startActivity(intent);
    }

    public void daggerAndroid(View view) {
        Intent intent = new Intent(this, DaggerAndroidActivity.class);
        startActivity(intent);
    }

}



