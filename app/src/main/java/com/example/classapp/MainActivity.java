package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "The onCreate() event", Toast.LENGTH_SHORT).show();

    }

    public void testBtn(View v){
        Toast.makeText(this, "Test BTN", Toast.LENGTH_SHORT).show();
    }
}