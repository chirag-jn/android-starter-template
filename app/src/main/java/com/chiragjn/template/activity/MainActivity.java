package com.chiragjn.template.activity;

import android.os.Bundle;
import android.view.View;

import com.chiragjn.template.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindView();
    }

    @Override
    void bindView() {

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        binding.helloWorld.setVisibility(View.VISIBLE);
    }
}