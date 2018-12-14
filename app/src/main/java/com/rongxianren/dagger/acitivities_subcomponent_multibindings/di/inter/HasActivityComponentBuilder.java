package com.rongxianren.dagger.acitivities_subcomponent_multibindings.di.inter;

import android.app.Activity;

public interface HasActivityComponentBuilder {
    ActivityComponentBuilder getActivityComponentBuilder(Class<? extends Activity> activityClass);
}
