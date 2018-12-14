package com.rongxianren.dagger.subcomponent_and_scope.abstract_factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.subcomponent_and_scope.abstract_factory.di.component.DaggerParentComponent1;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Maybach;

import javax.inject.Inject;

public class SubComponentActivity1 extends AppCompatActivity {


    @Inject
    Bike mBike;

    @Inject
    Maybach mMaybach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component1);

        DaggerParentComponent1.builder().build().getSubComponent().inject(this);
        
        System.out.println("SubComponentActivity1---mBike = " + mBike.run());
        System.out.println("SubComponentActivity1---mMaybach = " + mMaybach.run());

    }
}
