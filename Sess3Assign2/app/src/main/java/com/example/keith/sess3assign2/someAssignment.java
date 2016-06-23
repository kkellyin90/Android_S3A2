package com.example.keith.sess3assign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class someAssignment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_assignment);

        Button violet = (Button) findViewById(R.id.colorV);           //Displays Violet
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Violet", Toast.LENGTH_SHORT).show();
            }
        });

        Button indigo = (Button) findViewById(R.id.colorI);           //Displays Indigo
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Indigo", Toast.LENGTH_SHORT).show();
            }
        });



        Button blue = (Button) findViewById(R.id.colorB);           //Displays Blue
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Blue", Toast.LENGTH_SHORT).show();
            }
        });

        Button green = (Button) findViewById(R.id.colorG);           //Displays Green
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Green", Toast.LENGTH_SHORT).show();
            }
        });

        Button yellow = (Button) findViewById(R.id.colorY);           //Displays Yellow
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Yellow", Toast.LENGTH_SHORT).show();
            }
        });

        Button orange = (Button) findViewById(R.id.colorO);           //Displays Orange
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Orange", Toast.LENGTH_SHORT).show();
            }
        });

        Button red = (Button) findViewById(R.id.colorR);           //Displays Red
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(someAssignment.this, "Red", Toast.LENGTH_SHORT).show();
            }
        });


    }


}