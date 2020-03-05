package com.example.takehomelesson06_yueg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view) {
        EditText editAmount = findViewById(R.id.amount);
        EditText editTaxPercentage = findViewById(R.id.tax_percentage);
        EditText editTipPercentage = findViewById(R.id.tip_percentage);

        double amount = Double.parseDouble(editAmount.getText().toString());
        double taxPercentage = Double.parseDouble(editTaxPercentage.getText().toString());
        double tipPercentage = Double.parseDouble(editTipPercentage.getText().toString());

        Intent intent = new Intent(this, Display.class);
        intent.putExtra("amount", amount);
        intent.putExtra("taxPercentage", taxPercentage);
        intent.putExtra("tipPercentage", tipPercentage);
        startActivity(intent);
    }
}
