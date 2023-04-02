package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView menuAll;
    public TextView menuFavorite;
    public FloatingActionButton creteNoteFloatButton;
    public ListView noteListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize views
        menuAll = (TextView) findViewById(R.id.menuAll);
        menuFavorite = (TextView) findViewById(R.id.menuFavorite);
        creteNoteFloatButton = (FloatingActionButton) findViewById(R.id.creteNoteFloatButton);

        noteListView = (ListView) findViewById(R.id.noteListView);

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("test");
        myList.add("test1");
        myList.add("test2");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.list_note_title,myList);

        noteListView.setAdapter(arrayAdapter);

        menuAll.setOnClickListener(this);
        menuFavorite.setOnClickListener(this);
        creteNoteFloatButton.setOnClickListener(this);

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
        } else if (v.getId() == R.id.creteNoteFloatButton) {
            Toast.makeText(this, "Create Notes", Toast.LENGTH_SHORT).show();
        }
    }
}