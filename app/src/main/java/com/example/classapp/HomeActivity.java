package com.example.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView menuAll;
    public TextView menuFavorite;
    public FloatingActionButton creteNoteFloatButton;
    public ListView noteListView;
//    public ArrayList<Note> notesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //initialize views
        menuAll = (TextView) findViewById(R.id.menuAll);
        menuFavorite = (TextView) findViewById(R.id.menuFavorite);
        creteNoteFloatButton = (FloatingActionButton) findViewById(R.id.creteNoteFloatButton);
        noteListView = (ListView) findViewById(R.id.noteListView);

//        notesList.add(new Note(1,"Introduction to Java", "Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others. The rules and syntax of Java are based on the C and C++ languages.","https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/Introduction-to-Java-Programming-language.png",27.9f,54.6f,new Date()));
//        notesList.add(new Note(2,"Programing fundamental", "Programming involves activities such as analysis, developing understanding, generating algorithms, verification of requirements of algorithms including their correctness and resources consumption, and implementation (commonly referred to as coding) of algorithms in a target programming language.","https://media.proprofs.com/images/QM/user_images/2503852/New%20Project%20(25)(164).jpg",37.9f,34.6f,new Date()));
//        notesList.add(new Note(3,"Fundamental of DevOps", "a DevOps pipeline is a process that leverages automation and a number of tools to enable developers to quickly ship their code to a testing environment. The operations and development teams will then test that code to detect any security issues, bugs, or issues before deploying it to production.","https://learning.rpsconsulting.in/asset-v1:RPS+RPS_PACKT68+2020_T12+type@asset+block@9781789345742.jpg",-10.9f,24.6f,new Date()));


        //set on click listener
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