package com.example.simplerloginsignup;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Load home_page.xml

        TextView home = findViewById(R.id.welcome); // Fix the TextView ID

        Button button1, button2, button3;
        button1 = findViewById(R.id.red); // Fix the Button IDs
        button2 = findViewById(R.id.blue);
        button3 = findViewById(R.id.green);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.setTextColor(Color.RED);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.setTextColor(Color.BLUE); // Change to BLUE
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.setTextColor(Color.GREEN);
            }
        });
    }
}
