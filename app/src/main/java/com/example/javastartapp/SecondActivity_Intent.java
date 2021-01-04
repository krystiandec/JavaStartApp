package com.example.javastartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity_Intent extends AppCompatActivity {

    private EditText mSubject;
    private EditText mText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inytent_test);

        mSubject = findViewById(R.id.intent_subject);
        mText = findViewById(R.id.intent_text);
        sendButton = findViewById(R.id.intent_sendButton);

/*       poniżej kod tylko z ćwiczeń
 //explicit
        Intent explicitIntent = new Intent(getApplicationContext(),SecondActivity_Intent.class);
        startActivity(explicitIntent);
       //implicite
        String url = "http://www.google.pl"
        Intent impliciteIntent = new Intent(Intent.ACTION_VIEW);
        impliciteIntent.setData(Uri.parse(url));
        startActivity(impliciteIntent);
        //wysyłanie wiadomośći:
      Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT,"testuję wysyłanie");
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Wszystko działa ");
        startActivity(sendIntent);*/
    }

    public void sendButton(View v) {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, mSubject.getText().toString());
        sendIntent.putExtra(Intent.EXTRA_TEXT, mText.getText().toString());
        startActivity(sendIntent);
    }
}
