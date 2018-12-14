package com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.subcomponent_and_scope.entity.Bike;
import com.rongxianren.dagger.subcomponent_and_scope.entity.ICar;
import com.rongxianren.dagger.subcomponent_and_scope.subcomponent_builder.di.component.DaggerParentComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class SubComponentBuilderActivity extends AppCompatActivity {


    @Inject
    @Named("bike")
    ICar mBike;


    /**
     * Bean类中实现单例
     */
    @Inject
    Bike mBike1;

    @Inject
    Bike mBike2;


    /**
     * module中实现单例
     */
    @Inject
    ICar mBenz;

    @Inject
    ICar mBenz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_component_builder);
        DaggerParentComponent.builder().build().getSubComponentBuilder().build().inject(this);

        System.out.println("SubComponentBuilderActivity---" + mBike.run());
        System.out.println("SubComponentBuilderActivity---" + mBenz.run());
        System.out.println("\n");
        System.out.println("\n");


        System.out.println("SubComponentBuilderActivity---mBike1 = " + mBike1);
        System.out.println("SubComponentBuilderActivity---mBike2 = " + mBike2);
        System.out.println("\n");
        System.out.println("\n");


        System.out.println("SubComponentBuilderActivity---mBenz = " + mBenz);
        System.out.println("SubComponentBuilderActivity---mBenz1 = " + mBenz1);

    }
}







