package com.mou78.testpointcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //タイトルバーを非表示
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            // Runnable型のインスタンス化と定義
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 1000); // 遅らせたい時間(ミリ秒) 2000ミリ秒 -> 2秒
    }
}