package com.example.robertheller_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert_ftoc(View view) {
        EditText convert_this = (EditText)findViewById(R.id.enter_number);
        TextView results = (TextView)findViewById(R.id.display_results);

        String get_value = convert_this.getText().toString();
        double value = Double.parseDouble(get_value);

        double converted_val = (value - 32) * 0.55;

        results.setText(String.format("%.2f Celsius", converted_val));
    }

    public void convert_ctof(View view) {
        EditText convert_this = (EditText)findViewById(R.id.enter_number);
        TextView results = (TextView)findViewById(R.id.display_results);

        String get_value = convert_this.getText().toString();
        double value = Double.parseDouble(get_value);

        double converted_val = (value * 1.8) + 32;

        results.setText(String.format("%.2f Fahrenheit", converted_val));
    }
}