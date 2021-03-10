package com.example.work_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Gram_to_kilograms extends AppCompatActivity {
TextView output;
EditText input;
Button convert;
    ImageButton back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram_to_kilograms);


        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        convert = findViewById(R.id.convert);

        back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Gram_to_kilograms.this,"back" , Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float x = Integer.parseInt(input.getText().toString());
                x*=0.001;

                String s=String.valueOf(x);
                output.setText(s);
            }
        });



    }
}