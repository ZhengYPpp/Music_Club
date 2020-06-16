package com.example.awork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button HTUbtn = findViewById(R.id.HTUbtn);
        final Button GoShopbtn = findViewById(R.id.GoShopbtn);
        final Button fsmbtn = findViewById(R.id.FSMbtn);

        HTUbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HowToUse = new Intent(MainActivity.this,HowToUseActivity.class);
                startActivity(HowToUse);
            }
        });

        GoShopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoShop = new Intent(MainActivity.this,GoShopActivity.class);
                startActivity(GoShop);
            }
        });

        fsmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gofsm = new Intent(MainActivity.this,SheetMusicActivity.class);
                startActivity(gofsm);
            }
        });

    }



}
