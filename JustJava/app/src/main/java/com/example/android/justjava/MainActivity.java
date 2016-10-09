package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        displayPrice(quantity*3);

    }

    public void increment(View view){
        ++quantity;
        display(quantity);
    }
    public void decrement(View view){
        --quantity;
        if(quantity < 0){
            quantity = 0;
        }
        display(quantity);
    }

    public  void display(int number){
        TextView quantity = (TextView) findViewById(R.id.quantity_text_view);

        quantity.setText(""+number  );
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total : "+NumberFormat.getCurrencyInstance().format(number) + "\nThank You!");

    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}
