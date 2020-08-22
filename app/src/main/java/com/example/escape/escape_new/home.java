package com.example.escape.escape_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_home);
        Button newgame=(Button)findViewById(R.id.newgame);
        Button aboutme =(Button)findViewById(R.id.aboutus);
        newgame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                jumpstory();
            }
        });
        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(home.this, about.class);
                startActivity(intent);
            }
        });

    }public  void jumpstory(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.story);
        final ImageButton img=(ImageButton)findViewById(R.id.imageButton2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(home.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}