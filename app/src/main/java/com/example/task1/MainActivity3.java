package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    double hour;
    double minute;
    double second;
    double spifactor;
    TextView result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText input3 = findViewById(R.id.input3);
        EditText input4 = findViewById(R.id.input4);
        EditText input5 = findViewById(R.id.input5);
        Button Calculate = findViewById(R.id.button4);
        result3 = findViewById(R.id.result3);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputhour = input3.getText().toString();
                hour = Double.parseDouble(inputhour);
                String inputminute = input4.getText().toString();
                hour = Double.parseDouble(inputminute);
                String inputsecond = input5.getText().toString();
                hour = Double.parseDouble(inputsecond);
                calculate_spi_factor();
            }
        });
    }
    void calculate_spi_factor() {
        double fact = hour;
        int i;
        for(i=1;i<=hour;i++){
            fact=fact*i;}
        double spifactor = fact/(Math.pow(minute,3)+second);
        result3.setText(String.valueOf(spifactor));
    }
}