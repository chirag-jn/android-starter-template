package com.chiragjn.template;

import android.os.Bundle;

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