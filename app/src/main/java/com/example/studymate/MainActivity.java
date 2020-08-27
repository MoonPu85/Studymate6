package com.example.studymate;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<User> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button korButton = (Button) findViewById(R.id.btn_korean);
        korButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KoreaList_Activity.class);
                startActivity(intent);
            }
        });


        Button engButton = (Button) findViewById(R.id.btn_english);
        engButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), English_Activity.class);
                startActivity(intent);

            }
        });

        Button mathButton = (Button) findViewById(R.id.btn_math);
        mathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MathList_Activity.class);
                startActivity(intent);

            }
        });


        Button scianceButton = (Button) findViewById(R.id.btn_sciance);
        scianceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScianceList_Activity.class);
                startActivity(intent);

            }
        });


        Button ArtButton = (Button) findViewById(R.id.btn_art);
        ArtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ArtList_Activity.class);
                startActivity(intent);

            }
        });

        Button musicButton = (Button) findViewById(R.id.btn_music);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MusicList_Activity.class);
                startActivity(intent);

            }
        });

        Button commuButton = (Button) findViewById(R.id.btn_community);
        commuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CommunityList_Activity.class);
                startActivity(intent);

            }
        });

    }
}


