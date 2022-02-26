package com.chiragjn.template.activity;

import android.content.Intent;

import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;

import com.chiragjn.template.utils.ActivityResultHandler;

abstract public class BaseActivity extends AppCompatActivity {

    protected final ActivityResultHandler<Intent, ActivityResult> activityLauncher = ActivityResultHandler.registerActivityForResult(this);

    abstract void bindView();
}
