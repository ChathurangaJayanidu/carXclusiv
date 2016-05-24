package com.carxclusv.chathurangaj.carxclusv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        //getActionBar().hide();

        Thread t = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    Intent i = new Intent(SplashActivity.this, MainActivity2.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();


    }
}
