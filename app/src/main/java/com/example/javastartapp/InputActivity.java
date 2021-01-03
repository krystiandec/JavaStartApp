package com.example.javastartapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button okButton = findViewById(R.id.buttonOK);
        EditText editText = findViewById(R.id.insertName);
        RadioButton radioFemale = findViewById(R.id.genderFemale);
        RadioButton radioMale = findViewById(R.id.genderMale);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String gender;
                if (radioFemale.isChecked()) {
                    gender = "Kobieta !";
                } else {
                    gender = "Facet !";
                }

                Toast.makeText(getApplicationContext(), "O" + gender + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
