package com.example.last;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_map;
    private Button btn_lost;
    private Button btn_search;
    private Button btn_regi;
    private Button btn_help;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_map = (Button)findViewById(R.id.btn_map);

        btn_lost = (Button)findViewById(R.id.btn_lost);
       /* btn_search = (Button)findViewById(R.id.btn_search);
        btn_regi = (Button)findViewById(R.id.btn_regi);
       */
        btn_help = (Button)findViewById(R.id.btn_help);


        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent2);
            }
        });
        btn_lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, LostActivity.class);
                startActivity(intent3);
            }
        });
    }

}