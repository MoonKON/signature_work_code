package com.example.sportwellapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usertext;
    private EditText passtext;
    private Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usertext=(EditText)this.findViewById(R.id.ed1);
        passtext=(EditText)this.findViewById(R.id.ed2);
        loginbutton=(Button)this.findViewById(R.id.bt);
        loginbutton.setOnClickListener(new ButtonListener());
    }
    private class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            String user=usertext.getText().toString();
            String pass=passtext.getText().toString();
            if (user.equals("")||pass.equals("")){
                Toast.makeText(LoginActivity.this,"Username and Password cannot be empty!",Toast.LENGTH_SHORT).show();
            }
            else if (user.equals("Exerciser")&&pass.equals("3003")){
                Toast.makeText(LoginActivity.this,"Enjoy Your Exercise!",Toast.LENGTH_SHORT).show();
                Log.d("turn to next page","msg");
                Intent intent = new Intent(LoginActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(LoginActivity.this,"Incorrect Username or Password! Try again!",Toast.LENGTH_SHORT).show();
            }
        }
    }

}