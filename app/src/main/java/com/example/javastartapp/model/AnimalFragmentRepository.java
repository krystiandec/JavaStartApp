package com.example.javastartapp.model;

import android.widget.ListView;

import com.example.javastartapp.R;

import java.util.ArrayList;
import java.util.List;

public class AnimalFragmentRepository  {

    private static List<AnimalFragment> mAnimalFragments = new ArrayList<>();

    static {
        mAnimalFragments.add(new AnimalFragment(R.drawable.cat_icon,"Kot","Domowy zwierz - wredna bestia. "));
        mAnimalFragments.add(new AnimalFragment(R.drawable.dog_icon,"Pies","Taka przytulanka - większa i żywa i jak Cię widzi to wylewa na Ciebie wiadro miłośći. "));
        mAnimalFragments.add(new AnimalFragment(R.drawable.ele_icon,"Słonik","Ladny obrazek - bardzo mąrdre i pamiętliwe zwięrzęta. "));
    }

    public static List<AnimalFragment> getmAnimalFragments() {
        return mAnimalFragments;
    }
}
