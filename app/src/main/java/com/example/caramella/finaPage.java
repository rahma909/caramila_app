package com.example.caramella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class finaPage extends AppCompatActivity {
    private static int SPLASH_SCREEN=2000;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fina_page);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent=new Intent(finaPage.this,fristPage.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}