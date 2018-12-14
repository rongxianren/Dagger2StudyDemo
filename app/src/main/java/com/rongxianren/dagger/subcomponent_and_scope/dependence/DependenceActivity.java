package com.rongxianren.dagger.subcomponent_and_scope.dependence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.di.component.DaggerParentComponent2;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.di.component.DaggerSubComponent2;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.di.component.ParentComponent2;
import com.rongxianren.dagger.subcomponent_and_scope.dependence.di.component.SubComponent2;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Maybach;

import javax.inject.Inject;

public class DependenceActivity extends AppCompatActivity {


    @Inject
    Bike mBike;

    @Inject
    Maybach mMaybach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component_dependence);

        ParentComponent2 parentComponent2 = DaggerParentComponent2.builder().build();
        SubComponent2 subComponent2 = DaggerSubComponent2.builder().parentComponent2(parentComponent2).build();
        subComponent2.inject(this);

        System.out.println("DependenceActivity--- mBike = " + mBike.run());
        System.out.println("DependenceActivity--- mMaybach = " + mMaybach.run());
    }
}
