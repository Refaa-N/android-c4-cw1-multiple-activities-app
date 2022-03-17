package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        EditText bag1 =findViewById(R.id.PersonName1);
//       EditText bag2 =findViewById(R.id.PersonName2);
//       Button next =findViewById(R.id.button);
//       next.setOnClickListener(new View.OnClickListener() {
//            @Override
//           public void onClick(View view) {
//                if (bag1.getText().toString().isEmpty() || bag2.getText().toString().isEmpty()){
//                    //Do Nothing...
//                } else {
//                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                    String mybag = bag1.getText().toString();
//                    String mybag2 = bag2.getText().toString();
//                   intent.putExtra("bag" , mybag);
//                   intent.putExtra("bag3" , mybag2);
//                   startActivities(intent);
//                }
//            }
//
//            private void startActivities(Intent intent) {
//            }
//        });
//
//    }
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        EditText bag1 = findViewById(R.id.PersonName1);
        EditText bag2 = findViewById(R.id.PersonName2);

        Button next = findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bag1.getText().toString().isEmpty() || bag2.getText().toString().isEmpty()) {
                    //Do Nothing...
                } else {

                    String mybag = bag1.getText().toString();
                    String mybag2 = bag2.getText().toString();
                    intent.putExtra("bag", mybag);
                    intent.putExtra("bag3", mybag2);
                    startActivities(new Intent[]{intent});
                }

            }
        });
    }

}
