package com.rongxianren.dagger.activities_subcomponent_multibindings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rongxianren.dagger.R;
import com.rongxianren.dagger.activities_subcomponent_multibindings.app.MyApplication;

import javax.inject.Inject;

/**
 * 注意要切换应用的Application 为MyApplication
 */
public class MultiBinddingActivity extends AppCompatActivity {
    @Inject
    Integer versionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcomponent_multi_bindding);
        injectMembers();

        System.out.println("--- MultiBinddingActivity --- versionCode = " + versionCode);
    }

    private void injectMembers() {
        MyApplication.get(this).getActivityComponentBuilder(MultiBinddingActivity.class)
                .build().injectMembers(this);
    }
}
