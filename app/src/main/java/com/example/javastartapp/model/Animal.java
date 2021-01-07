package com.example.javastartapp.model;

import android.media.Image;

public class Animal {
    Integer mImage;
    String mDescription;

    public Animal(Integer image, String description) {
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
