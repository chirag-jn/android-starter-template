package com.chiragjn.template;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    Context ctx;

    @Override
    public void onCreate() {
        super.onCreate();

        bindViews();

    }

    void bindViews() {

        ctx = getApplicationContext();
    }
}
