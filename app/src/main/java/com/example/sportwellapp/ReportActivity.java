package com.example.sportwellapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ReportActivity.this, ExerciseActivity.class);
            startActivity(intent);
            finish();
        });

        Button chooseButton = findViewById(R.id.choose);
        chooseButton.setOnClickListener(v -> {
            Intent intent = new Intent(ReportActivity.this, ChooseActivity.class);
            startActivity(intent);
            finish();
        });
    }
}