package com.sample.dragger2;

import android.app.Application;

import com.sample.dragger2.di.ApiClientModule;
import com.sample.dragger2.di.ApiComponent;
import com.sample.dragger2.di.AppModule;
import com.sample.dragger2.di.DaggerApiComponent;

public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiClientModule(new ApiClientModule("https://httpbin.org/"))
                .build();
    }

    public ApiComponent getComponent() {
        return mApiComponent;
    }
}