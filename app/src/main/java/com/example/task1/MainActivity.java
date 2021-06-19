package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;
import java.security.PrivateKey;

public class MainActivity<btnGoto, context> extends AppCompatActivity {
    double lorentz_force ;
    double speed_v ;
    TextView result;
    private Button btnGoto;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        btnGoto = findViewById(R.id.btngoto);
        btnGoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

            }
        });

        EditText input = findViewById(R.id.input);
        Button calculate = findViewById(R.id.button_id);
        result = findViewById(R.id.result);
        calculate.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    String inputspeed = input.getText().toString();
                    speed_v= Double.parseDouble(inputspeed);
                    calculate_lorentz_force();


                }

        });
    }

    void calculate_lorentz_force() {
        double lorentz_force = 1 / Math.sqrt(1 - (Math.pow(speed_v, 2) / Math.pow(300000000, 2)));
        result.setText(String.valueOf(lorentz_force));
    }
}