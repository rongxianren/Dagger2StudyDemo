package com.rongxianren.dagger.mapmultibindings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;

import java.util.Map;

import javax.inject.Inject;

public class MapBindingsActivity extends AppCompatActivity {
    @Inject
    Map<String, Long> longsByStringMap;

    @Inject
    Map<Class<?>, String> classMap;

//    @Inject
//    int versionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_bindings);
        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.inject(this);
//        System.out.println("MapBindingsActivity---Map<String,Long>--- = " + myComponent.longsByString());
//        System.out.println("MapBindingsActivity---Map<Class,Long>--- = " + myComponent.stringByClass());

        System.out.println("MapBindingsActivity---Map<Class,Long>--- = " + classMap);
        System.out.println("MapBindingsActivity--- longsByStringMap = " + longsByStringMap);
    }
}
