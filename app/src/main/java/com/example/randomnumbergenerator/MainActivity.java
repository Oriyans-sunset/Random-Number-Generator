package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;
import android.widget.SeekBar;
import 	android.view.View;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button random_button = findViewById(R.id.random_button);
        TextView random_textview = findViewById(R.id.random_textView);
        SeekBar random_seekBar = findViewById(R.id.random_seekBar);

        random_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 String s = String.valueOf(find_number());
                random_textview.setText(s);

            }

            private int find_number()
            {
                int number = random_seekBar.getProgress();
                Random rand = new Random();
                int random_number = rand.nextInt((number+1));
                return random_number;
            }

        });
        }



}
