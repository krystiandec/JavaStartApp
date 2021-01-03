package com.example.javastartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SecondActivity_Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        //explicit
        Intent explicitIntent = new Intent(getApplicationContext(),SecondActivity_Intent.class);
        startActivity(explicitIntent);*/
  /*      //implicite
        String url = "http://www.google.pl"
        Intent impliciteIntent = new Intent(Intent.ACTION_VIEW);
        impliciteIntent.setData(Uri.parse(url));
        startActivity(impliciteIntent);*/
        //wysyłanie wiadomośći:
/*        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT,"testuję wysyłanie");
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Wszystko działa ");
        startActivity(sendIntent);*/

    }
}