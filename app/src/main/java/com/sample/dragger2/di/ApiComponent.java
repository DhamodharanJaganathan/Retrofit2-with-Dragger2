package com.sample.dragger2.di;

import com.sample.dragger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiClientModule.class, AppModule.class})
public interface ApiComponent {

    void inject(MainActivity mainActivity);
}