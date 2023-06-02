package com.example.stars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView starsList = findViewById(R.id.ListStars);
        String[] stars = getResources().getStringArray(R.array.Stars);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, stars);
        starsList.setAdapter(adapter);
        starsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
               Transition(position);
            }
        });
    }


    public void Transition(int position)
        {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("position", position);
            startActivity(intent);
        }


}