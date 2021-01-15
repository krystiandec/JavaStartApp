package com.example.javastartapp.presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.javastartapp.R;
import com.example.javastartapp.model.AnimalFragment;
import com.example.javastartapp.model.AnimalFragmentRepository;

public class AnimalDetailFragmentPresenter extends Fragment {

    public static final String ANIMAL_ID = "extra.animal_id";
    private TextView title;
    private ImageView imageView;
    private TextView description;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animal_detail, container, false);
        //tutaj postępujemy jak z ViewHolderem -> przypisujemy ścieżki z widoku do zmiennych
        title = view.findViewById(R.id.titleAnimalFragment);
        description = view.findViewById(R.id.descriptionANimalFragment);
        imageView = view.findViewById(R.id.imageAnimalFragement);
        if (getArguments() != null) {
            int animalID = getArguments().getInt(ANIMAL_ID);
            showAnimal(AnimalFragmentRepository.getmAnimalFragments().get(animalID));
        }
        return view; // dokończyć fragment z listą zwierząt.
    }

    public void showAnimal(AnimalFragment animal) {
        title.setText(animal.getName());
        description.setText(animal.getDescription());
        imageView.setImageResource(animal.getImage());
    }
}
