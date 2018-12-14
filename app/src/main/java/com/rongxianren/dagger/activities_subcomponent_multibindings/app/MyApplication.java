package com.rongxianren.dagger.activities_subcomponent_multibindings.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter.ActivityComponentBuilder;
import com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter.HasActivityComponentBuilder;
import com.rongxianren.dagger.activities_subcomponent_multibindings.di.component.DaggerAppComponent;

import java.util.Map;

import javax.inject.Inject;

/**
 * 记得在Manifest.xml文件中改过来
 */
public class MyApplication extends Application implements HasActivityComponentBuilder {

    @Inject
    Map<Class<? extends Activity>, ActivityComponentBuilder> activityComponentBuilder;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.create().inject(this);

        System.out.println("----MyApplication--- activityComponentBuilder= " + activityComponentBuilder);
    }

    @Override
    public ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass) {
        return activityComponentBuilder.get(activityClass);
    }

    public static HasActivityComponentBuilder get(Context context) {
        return ((HasActivityComponentBuilder) context.getApplicationContext());
    }
}
