package com.example.admin.taarangana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sponsors extends AppCompatActivity {

    TextView textView2;
    Typeface typeface3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        textView2=(TextView)findViewById(R.id.textView2);

        typeface3 = Typeface.createFromAsset(getAssets(), "fonts/Chunkfive.otf");
        textView2.setTypeface(typeface3);

    }
}
