package com.example.myapplicationhomework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Quizes = findViewById(R.id.editTextTextPersonName2) ;
        EditText HomeWork = findViewById(R.id.editTextTextPersonName1) ;
        EditText MidTerms = findViewById(R.id.editTextTextPersonName3) ;
        EditText Final = findViewById(R.id.editTextTextPersonName4) ;

        Button cal = findViewById(R.id.button2) ;
        TextView total = findViewById(R.id.textView4) ;
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(Quizes.getText().toString());
                int b = Integer.parseInt(HomeWork.getText().toString());
                int c = Integer.parseInt(MidTerms.getText().toString());
                int d = Integer.parseInt(Final.getText().toString());
                int x = a + b + c + d;
                System.out.println("///" + x);
                total.setText(x + "");
            }});




            }

        }