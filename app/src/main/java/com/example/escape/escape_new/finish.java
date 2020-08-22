package com.example.escape.escape_new;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_finish);
        final Button newgame=(Button)findViewById(R.id.new1);
        final Button about=(Button)findViewById(R.id.button4);
newgame.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent();
        intent.setClass(finish.this,MainActivity.class);
        startActivity(intent);
        finish.this.finish();
    }
});
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(finish.this,about.class);
                startActivity(intent);
                finish.this.finish();
            }
        });
    }
}
