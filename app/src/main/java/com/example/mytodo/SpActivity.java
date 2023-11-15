package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        //        to create a splash screen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(SpActivity.this, MainActivity.class));
//                the new Intent() is a anonymous object, used to release memory when called, not a best practice but ok, issue comes when data is transferred between other activities.
                finish();
            }
        }, 3000);
    }
}