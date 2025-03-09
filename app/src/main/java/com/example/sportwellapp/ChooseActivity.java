package com.example.sportwellapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        ImageButton chooseExerciseButton = findViewById(R.id.deadlift);

        chooseExerciseButton.setOnClickListener(view -> {
            Intent intent = new Intent(ChooseActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
    }
}
