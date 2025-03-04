package com.example.hhhhhh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    // Rotate animation
                    RotateAnimation rotate = new RotateAnimation(0, 180,
                            Animation.RELATIVE_TO_SELF, 0.5f,
                            Animation.RELATIVE_TO_SELF, 0.5f);
                    rotate.setDuration(5000);
                    rotate.setInterpolator(new LinearInterpolator());
                    logo.setAnimation(rotate);

                    // Wait for 5 seconds
                    sleep(5000);

                    // Move to MainActivity
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Close the splash screen

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
