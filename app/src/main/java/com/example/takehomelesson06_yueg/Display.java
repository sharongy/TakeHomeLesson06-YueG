package com.example.takehomelesson06_yueg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent receivingIntent = getIntent();
        TextView display = findViewById(R.id.display);

        double amount = receivingIntent.getDoubleExtra("amount", 0);
        double taxPercentage = receivingIntent.getDoubleExtra("taxPercentage", 0);
        double tipPercentage = receivingIntent.getDoubleExtra("tipPercentage", 0);
        double salesTax = amount * taxPercentage;
        double tip = amount * tipPercentage;
        double grandTotal = amount + salesTax + tip;

        //display.setText("Total: " + amount + "\nSales Tax: " + salesTax + "\nTip: " + tip + "\nGrand Total: " + grandTotal);

        display.setText(String.format("Total: %s\n" + "Sales Tax: %s\n" + "Tip: %s\n" + "Grand Total: %s",
                amount, salesTax, tip, grandTotal));
    }
}
