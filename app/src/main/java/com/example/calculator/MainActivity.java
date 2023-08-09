package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button BtnAdd,BtnSub,BtnDiv,BtnMult;
    TextView Result;
    EditText ET1,ET2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnAdd = findViewById(R.id.button);
        BtnSub = findViewById(R.id.button2);
        BtnDiv = findViewById(R.id.button3);
        BtnMult = findViewById(R.id.button4);
        Result = findViewById(R.id.textView);
        ET1 = findViewById(R.id.editTextNumber);
        ET2 = findViewById(R.id.editTextNumber2);

        int n1 = Integer.parseInt(ET1.getText().toString());
        int n2 = Integer.parseInt(ET2.getText().toString());
        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText("");
                int a = n1+n2;
                Result.setText(Integer.toString(a));

            }
        });
        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText("");
                int a = n1-n2;
                Result.setText(Integer.toString(a));

            }
        });
        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText("");
                int a = n1/n2;
                Result.setText(Integer.toString(a));

            }
        });
        BtnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText("");
                int a = n1*n2;
                Result.setText(Integer.toString(a));

            }
        });
    }

}