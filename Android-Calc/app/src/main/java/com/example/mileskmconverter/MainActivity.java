package com.example.mileskmconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.time.format.FormatStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button miles_to_km= (Button)findViewById(R.id.miles_to_km);
        miles_to_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText miles=(EditText)findViewById(R.id.miles);
                EditText km = (EditText)findViewById(R.id.km);
                double double_miles = Double.valueOf(miles.getText().toString());
                double double_km= double_miles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                km.setText(formatVal.format(double_km));
            }
        });
        Button km_to_miles= (Button)findViewById(R.id.km_to_miles);
        km_to_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText km=(EditText)findViewById(R.id.km);
                EditText miles = (EditText)findViewById(R.id.miles);
                double double_km = Double.valueOf(miles.getText().toString());
                double double_miles= double_km*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                miles.setText(formatVal.format(double_miles));
            }
        });
    }
}
