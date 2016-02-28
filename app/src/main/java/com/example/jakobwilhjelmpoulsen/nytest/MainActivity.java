package com.example.jakobwilhjelmpoulsen.nytest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    LinearLayout background;
    Button btn1, btn2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        background = (LinearLayout) findViewById(R.id.background);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById((R.id.btn2));

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //click button code
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#006699"));
            }

    });
    }
}
