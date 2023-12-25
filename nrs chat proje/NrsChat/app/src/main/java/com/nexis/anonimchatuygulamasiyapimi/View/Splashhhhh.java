package com.nexis.anonimchatuygulamasiyapimi.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.nexis.anonimchatuygulamasiyapimi.R;

public class Splashhhhh extends AppCompatActivity {
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashhhhh);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashhhhh.this,GirisYapActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}