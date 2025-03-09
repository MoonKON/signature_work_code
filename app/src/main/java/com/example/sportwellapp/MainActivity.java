package com.example.sportwellapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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
                Toast.makeText(MainActivity.this,"Username and Password cannot be empty!",Toast.LENGTH_SHORT).show();
            }
            else if (user.equals("Exerciser")&&pass.equals("3003")){
                Toast.makeText(MainActivity.this,"Enjoy Your Exercise!",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this,"Incorrect Username or Password! Try again!",Toast.LENGTH_SHORT).show();
            }
        }
    }

}