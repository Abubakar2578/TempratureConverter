package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num;

    Button ctof , ftoc;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.editTextNumberDecimal);
        ctof = findViewById(R.id.button);
        ftoc = findViewById(R.id.button2);
        text = findViewById(R.id.textView);


        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(num.getText().toString());

                double temp = ( 1.8 *input) + 32;

                text.setText("Temprature in Farenheight is: " + String.format("%.2f", temp));
            }
        });


        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input = Double.parseDouble(num.getText().toString());
                double temp = (input - 32) * 5/9;

                text.setText("Temprature in Celcius is: " + String.format("%.2f", temp));

            }
        });



    }
}