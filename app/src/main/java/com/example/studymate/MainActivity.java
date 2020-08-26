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
//
//
//        Button engButton = (Button) findViewById(R.id.btn_english);
//        engButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), EngActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        Button scianceButton = (Button) findViewById(R.id.btn_sciance);
//        scianceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ScienceActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//
//        Button sociButton = (Button) findViewById(R.id.btn_community);
//        sociButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CommunityActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//        Button artButton = (Button) findViewById(R.id.btn_art);
//        artButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ArtActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//
//        Button musicButton = (Button) findViewById(R.id.btn_music);
//        mathButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
//                startActivity(intent);
//
//            }
//        });
    }


}