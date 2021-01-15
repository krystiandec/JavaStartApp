package com.example.javastartapp.activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.javastartapp.R;

public class ActivityLayoutDependingOnOrientation extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_depending_on_orientation);
    }
}
