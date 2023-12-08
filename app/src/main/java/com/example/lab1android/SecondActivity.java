package com.example.lab1android;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        layout = findViewById(R.id.layout);

        String color = getIntent().getStringExtra("color");

        if (color != null) {
            if (color.equalsIgnoreCase("red")) {
                layout.setBackgroundColor(Color.RED);
            } else if (color.equalsIgnoreCase("green")) {
                layout.setBackgroundColor(Color.GREEN);
            } else if (color.equalsIgnoreCase("blue")) {
                layout.setBackgroundColor(Color.BLUE);
            }
        }
    }
}
