package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView inf = findViewById(R.id.textView5);
        TextView inf2 = findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();

        String finally1 = bundle.getString("bag");
        String finally2 = bundle.getString("bag3");

        inf.setText(finally1);
        inf2.setText(finally2);

    }
}