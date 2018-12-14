package com.rongxianren.dagger.activities_subcomponent_multibindings.di.inter;

import android.app.Activity;

public interface HasActivityComponentBuilder {
    ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass);
}
