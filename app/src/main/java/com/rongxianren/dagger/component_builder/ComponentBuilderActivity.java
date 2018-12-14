package com.rongxianren.dagger.component_builder;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.component_builder.di.component.DaggerComponentBuilderComponent;
import com.rongxianren.dagger.component_builder.di.module.ComponentBuilderModule;

import javax.inject.Inject;

public class ComponentBuilderActivity extends AppCompatActivity {


    @Inject
    SharedPreferences mSharePreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_builder);
        DaggerComponentBuilderComponent.builder().componentBuilderModule(
                new ComponentBuilderModule(getApplication())
        ).build().inject(this);

//        DaggerComponentBuilderComponent.builder().application(getApplication()).build().inject(this);
        System.out.println("ComponentBuilderActivity---" + mSharePreferences);
    }
}
