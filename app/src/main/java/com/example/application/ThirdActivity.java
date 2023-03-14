package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class ThirdActivity extends AppCompatActivity {

    EditText editText;
    MaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText.findViewById(R.id.editAge);
        materialButton.findViewById(R.id.thirdNextButton);

        String age = editText.getText().toString();

        materialButton.setOnClickListener(v -> {
            Intent intent = new Intent(ThirdActivity.this, LastActivity.class);
            intent.putExtra("ageKey", age);
            startActivity(intent);
        });
    }
}