package com.example.smartcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    private Button add, sub, prod, div;

    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);

        add = findViewById(R.id.addButtonId);
        sub = findViewById(R.id.subButtonId);
        prod = findViewById(R.id.prodButtonId);
        div = findViewById(R.id.divButtonId);

        result = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                double numbr1 = Double.parseDouble(number1);
                double numbr2 = Double.parseDouble(number2);

                double sum = numbr1 + numbr2;

                result.setText("Sum of " + numbr1 + " and " + numbr2 + " is: " + sum);

            }


        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                double numbr1 = Double.parseDouble(number1);
                double numbr2 = Double.parseDouble(number2);

                double sub = numbr1 - numbr2;

                result.setText("Sub of " + numbr1 + " and " + numbr2 + " is: " + sub);

            }


        });

        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                double numbr1 = Double.parseDouble(number1);
                double numbr2 = Double.parseDouble(number2);

                double prod = numbr1 * numbr2;

                result.setText("Production of " + numbr1 + " and " + numbr2 + " is: " + prod);

            }


        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                double numbr1 = Double.parseDouble(number1);
                double numbr2 = Double.parseDouble(number2);

                double div = numbr1 / numbr2;

                result.setText("Division of " + numbr1 + " and " + numbr2 + " is: " + div);

            }


        });

    }
}