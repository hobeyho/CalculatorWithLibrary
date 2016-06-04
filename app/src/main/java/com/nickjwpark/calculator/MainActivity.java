package com.nickjwpark.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPlus, btnMinus, btnMultiply, btnDivide;
    Button btnAbs, btnPow, btnPrime;
    EditText editTextNum1, editTextNum2;
    TextView textViewAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnAbs = (Button) findViewById(R.id.btnAbs);
        btnPow = (Button) findViewById(R.id.btnPow);
        btnPrime = (Button) findViewById(R.id.btnPrime);

        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);

        textViewAnswer = (TextView) findViewById(R.id.textViewAnswer);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int b = Integer.parseInt(editTextNum2.getText().toString());
                int answer = myMathLibrary.add(a, b);
                showAnswer(answer);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int b = Integer.parseInt(editTextNum2.getText().toString());
                int answer = myMathLibrary.subtract(a, b);
                showAnswer(answer);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int b = Integer.parseInt(editTextNum2.getText().toString());
                int answer = myMathLibrary.multiply(a, b);
                showAnswer(answer);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int b = Integer.parseInt(editTextNum2.getText().toString());
                int answer = myMathLibrary.divide(a, b);
                showAnswer(answer);
            }
        });

        btnAbs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int answer = myMathLibrary.abs(a);
                showAnswer(answer);
            }
        });

        btnPrime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                boolean answer = myMathLibrary.isPrime(a);
                if(answer){
                    showAnswer(1);
                } else {
                    showAnswer(0);
                }
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(editTextNum1.getText().toString());
                int b = Integer.parseInt(editTextNum2.getText().toString());
                int answer = myMathLibrary.pow(a, b);
                showAnswer(answer);
            }
        });

    }


    public void showAnswer(int answer){
        textViewAnswer.setText(""+answer);
    }
}
