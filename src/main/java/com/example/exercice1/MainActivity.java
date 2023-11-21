package com.example.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById( R.id.line1);
        ArrayList<String> data = new ArrayList<>();
        data.add("Python");
        data.add("Swift");
        data.add("java");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice,data);
        listView.setAdapter(arrayAdapter);
       listView.setChoiceMode(1);
    }
}