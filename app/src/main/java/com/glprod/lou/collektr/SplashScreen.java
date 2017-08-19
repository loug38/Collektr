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
        RotateAnimation rotation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotation.setDuration(10000);
        rotation.setInterpolator(new LinearInterpolator());
        rotation.setFillAfter(true);

        ImageView shadows = (ImageView) findViewById(R.id.Shadows);
        shadows.startAnimation(rotation);
    }
}
