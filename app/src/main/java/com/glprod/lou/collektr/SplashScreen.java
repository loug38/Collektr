package com.glprod.lou.collektr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        RotateAnimation rotation = new RotateAnimation(0.0f, 3, Animation.RELATIVE_TO_SELF, 0.95f, Animation.RELATIVE_TO_SELF, 0.1f);
        rotation.setDuration(600);
        rotation.setInterpolator(new LinearInterpolator());
        rotation.setRepeatCount(Animation.INFINITE);
        rotation.setRepeatMode(Animation.REVERSE);
        rotation.setFillAfter(true);

        ImageView shadows = (ImageView) findViewById(R.id.Needle);
        shadows.startAnimation(rotation);
    }
}
