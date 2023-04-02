package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText usernameInput;
    public EditText passwordInput;
    public Button loginButton;
    public TextView orCreateAccountTex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //initialize view
        usernameInput = (EditText) findViewById(R.id.usernameInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
        loginButton = (Button) findViewById(R.id.loginButton);
        orCreateAccountTex = (TextView) findViewById(R.id.orCreateAccountText);
        
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.loginButton){
            loin();
        }
    }

    public void loin(){
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();

        Toast.makeText(this, "username: "+username+"\npassword: "+password, Toast.LENGTH_SHORT).show();

        if ((username.equals("gisacc54") && password.equals("password")) || username.equals("a")){
            Intent intent = new Intent(this,HomeActivity.class);
            startActivities(new Intent[]{intent});
        }

    }
}