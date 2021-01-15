package com.example.javastartapp.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.javastartapp.R;
import com.example.javastartapp.presenter.AnimalDetailFragmentPresenter;
import com.example.javastartapp.presenter.AnimalListFragmentPresenter;

public class AnimalFragmentListActivity extends AppCompatActivity implements AnimalListFragmentPresenter.OnAnimalClickedListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_animal_list);
    }

    @Override
    public void onAnimalClicked(int id) {
        Bundle bundle = new Bundle();
        bundle.putInt(AnimalDetailFragmentPresenter.ANIMAL_ID, id);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            AnimalDetailFragmentPresenter animalDetailFragmentPresenter = new AnimalDetailFragmentPresenter();
            animalDetailFragmentPresenter.setArguments(bundle);
            findViewById(R.id.label_show_details).setVisibility(View.GONE);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.addToBackStack(null);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.commit();
            return;
        }
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Intent intent = new Intent(this, AnimalDetailFragmentPresenter.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }
}


