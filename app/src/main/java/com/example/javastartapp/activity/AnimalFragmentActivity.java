package com.example.javastartapp.activity;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.javastartapp.presenter.AnimalDetailFragmentPresenter;

public class AnimalFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        if(savedInstanceState == null){
            AnimalDetailFragmentPresenter animalDetailFragmentPresenter = new AnimalDetailFragmentPresenter();
            animalDetailFragmentPresenter.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(android.R.id.content,animalDetailFragmentPresenter).commit();
        }
    }
}
