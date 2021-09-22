package com.chiragjn.template.activity;

import android.os.Bundle;

import com.chiragjn.template.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindView();
    }

    @Override
    void bindView() {
        setContentView(R.layout.activity_main);
    }
}