package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
public class MainActivity extends AppCompatActivity {
    double lorentz_force , speed_v ;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input = findViewById(R.id.input);
        Button calculate = findViewById(R.id.button_id);
        result = findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    String inputspeed = input.getText().toString();
                    speed_v= Double.parseDouble(inputspeed);
                    calculate_lorentz_force(float speed_v);

                }

        });


    }
    void calculate_lorentz_force(float speed_v){
        double lorentz_force =1/Math.sqrt(1-(Math.pow(speed_v,2)/Math.pow(300000000,2)));
