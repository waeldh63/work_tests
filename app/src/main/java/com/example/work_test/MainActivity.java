package com.example.work_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_home;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        list_home = findViewById(R.id.list_home);
        String[] values = new String[]{
                "Gram to kilograms", "Kilograms to pounds" , "Centimeters to meters","Centimeters to inches"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        list_home.setAdapter(adapter);
        list_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(view.getContext(),Gram_to_kilograms.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(view.getContext(),Kilograms_to_pounds.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(view.getContext(),Centimeters_to_meters.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(view.getContext(),Centimeters_to_inches.class);
                    startActivity(intent);
                }
            }
        });
    }


}