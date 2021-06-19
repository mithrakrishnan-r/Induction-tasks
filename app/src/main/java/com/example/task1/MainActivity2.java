package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements MainActivity2b {
    private Button button3;
    private Context context;
    double v;
    double lf;
    TextView result1;
    TextView Answer;
    double oblf;
    private View YourView;

    public MainActivity2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context = this;
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity3.class);
                startActivity(intent);

            }


        });
        EditText input1 = findViewById(R.id.input1);
        Button button1 = findViewById(R.id.button1);
        result1 = findViewById(R.id.result1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputv = input1.getText().toString();
                v = Double.parseDouble(inputv);
                calculate_lorentzforce();
            }
        });
    }
    void calculate_lorentzforce() {
        double lf = 1 / Math.sqrt(1 - (Math.pow(v, 2) / Math.pow(300000000, 2)));
        result1.setText(String.valueOf(lf));
    }

    EditText input2 = findViewById(R.id.input2);
    Button button2 = findViewById(R.id.button2);
    TextView result2 = findViewById(R.id.result2);

    public void setButton2(Button button2) {
        this.button2 = button2;
    }


    @Override
          public void onClick(View view){
              String inputoblf = input2.getText().toString();
              oblf = Double.parseDouble(inputoblf);
              check_answer();


          }
          void check_answer() {
              if (lf == oblf) {
                  YourView.setBackgroundColor(Color.argb(0, 0, 255, 0));
                  result2.setText("Correct");

              }
              else
              {YourView.setBackgroundColor(Color.argb(0, 255, 0, 0));
                  result2.setText("Wrong");
          }
}}

