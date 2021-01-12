package com.example.javastartapp.model;

import android.media.Image;

public class AnimalRecyclerView {
    Integer mImage;
    String mDescription;

    public AnimalRecyclerView(Integer image, String description) {
        mImage = image;
        mDescription = description;
    }

    public Integer getImage() {
        return mImage;
    }

    public String getDescription() {
        return mDescription;
    }
}
