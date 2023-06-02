package com.example.stars;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String[] text = getResources().getStringArray(R.array.text);
        TextView txt = findViewById(R.id.txt);
        ImageView image = findViewById(R.id.image);


    }
}
