package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView menuAll;
    public TextView menuFavorite;
    public FloatingActionButton creteNoteFloatButon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize views
        menuAll = (TextView) findViewById(R.id.menuAll);
        menuFavorite = (TextView) findViewById(R.id.menuFavorite);
        creteNoteFloatButon = (FloatingActionButton) findViewById(R.id.creteNoteFloatButon);

        menuAll.setOnClickListener(this);
        menuFavorite.setOnClickListener(this);
        creteNoteFloatButon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menuAll){
            menuAll.setTextAppearance(R.style.textMenuActive);
            menuAll.setBackground(getDrawable(R.drawable.borderbottom));

            menuFavorite.setTextAppearance(R.style.textMenu);
            menuFavorite.setBackground(getDrawable(R.drawable.no_borderbottom));
        } else if (v.getId() == R.id.menuFavorite) {
            menuFavorite.setTextAppearance(R.style.textMenuActive);
            menuFavorite.setBackground(getDrawable(R.drawable.borderbottom));

            menuAll.setTextAppearance(R.style.textMenu);
            menuAll.setBackground(getDrawable(R.drawable.no_borderbottom));
        } else if (v.getId() == R.id.creteNoteFloatButon) {
            Toast.makeText(this, "Create Notes", Toast.LENGTH_SHORT).show();
        }
    }
}