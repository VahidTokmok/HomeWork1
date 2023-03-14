package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView nameView, surnameView, ageView;

    String name, surname, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        nameView.findViewById(R.id.resultName);
        surnameView.findViewById(R.id.resultSurname);
        ageView.findViewById(R.id.resultAge);

        name = getIntent().getStringExtra("nameKey");
        nameView.setText(name);

    }
}