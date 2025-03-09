package com.example.sportwellapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SurveyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey);

        Button finishButton = findViewById(R.id.finishButton);

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (areAllQuestionsAnswered()) {
                    Toast.makeText(SurveyActivity.this, "All questions answered. Proceeding...", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SurveyActivity.this, ChooseActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean areAllQuestionsAnswered() {
        EditText[] questions = new EditText[]{
                findViewById(R.id.age),
                findViewById(R.id.gender),
                findViewById(R.id.height),
                findViewById(R.id.weight),
                findViewById(R.id.q5),
                findViewById(R.id.q6),
                findViewById(R.id.q7),
                findViewById(R.id.q8),
                findViewById(R.id.q9),
                findViewById(R.id.q10),
        };
        for (EditText question : questions) {
            if (question.getText().toString().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
