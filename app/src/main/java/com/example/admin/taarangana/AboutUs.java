package com.example.admin.taarangana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
    TextView about;
    Typeface typeface1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        about=(TextView)findViewById(R.id.about);

        typeface1 = Typeface.createFromAsset(getAssets(), "fonts/AlexBrush-Regular.ttf");
        about.setTypeface(typeface1);


        Animation zoomOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        about.startAnimation(zoomOutAnimation);
    }
}
