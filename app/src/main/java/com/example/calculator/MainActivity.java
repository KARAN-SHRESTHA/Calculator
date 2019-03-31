package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0
            , Dot, Divide, Multiply, Subtract, Add, Calculate;

    private double var1, var2;
    private boolean add, sub, multiply, div;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tvOut = findViewById(R.id.tvOut);

    num0 = findViewById(R.id.num0);
    num1 = findViewById(R.id.num1);
    num2 = findViewById(R.id.num2);
    num3 = findViewById(R.id.num3);
    num4 = findViewById(R.id.num4);
    num5 = findViewById(R.id.num5);
    num6 = findViewById(R.id.num6);
    num7 = findViewById(R.id.num7);
    num8 = findViewById(R.id.num8);
    num9 = findViewById(R.id.num9);

    Dot = findViewById(R.id.Dot);
    Divide = findViewById(R.id.Divide);
    Multiply = findViewById(R.id.Multiply);
    Subtract = findViewById(R.id.Subtract);
    Add = findViewById(R.id.Add);
    Calculate = findViewById(R.id.Calculate);





        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "0");

            }
        });


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "1");

            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "2");

            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "3");

            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "4");

            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "5");

            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "6");

            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "7");

            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "8");

            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + "9");

            }
        });


        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOut.setText(tvOut.getText().toString() + ".");

            }
        });


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(tvOut.getText() + "");
                add = true;
                tvOut.setText(null);
            }
        });



        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(tvOut.getText() + "");
                sub = true;
                tvOut.setText(null);
            }
        });


        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(tvOut.getText() + "");
                multiply = true;
                tvOut.setText(null);
            }
        });



        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(tvOut.getText() + "");
                div = true;
                tvOut.setText(null);
            }
        });


        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                var2 = Double.parseDouble(tvOut.getText() + "");

                if(add==true)
                {
                    tvOut.setText(var1+var2+"");
                    add = false;
                }

                if(sub==true)
                {
                    tvOut.setText(var1-var2+"");
                    sub = false;
                }

                if(multiply==true)
                {
                    tvOut.setText(var1*var2+"");
                    multiply = false;
                }

                if(div==true)
                {
                    tvOut.setText(var1/var2+"");
                    div = false;
                }

            }
        });





    }
}
