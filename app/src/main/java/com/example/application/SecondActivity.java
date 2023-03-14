package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    EditText editText;
    MaterialButton materialButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText.findViewById(R.id.editSurname);
        materialButton.findViewById(R.id.secondNextButton);

        String surname = editText.getText().toString();

        materialButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            intent.putExtra("surnameKey", surname);
            startActivity(intent);
        });



    }
}