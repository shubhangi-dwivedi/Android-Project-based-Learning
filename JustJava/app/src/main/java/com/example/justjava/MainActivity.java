package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity=2;

    /*This method is called when plus button is clicked*/
    public void increment(View view) {
        quantity+=1;
        display(quantity);
    }

    /*This method is called when minus button is clicked*/
    public void decrement(View view) {
        quantity-=1;
        display(quantity);
    }

    /*This method is called when order button is clicked*/
    public void submitOrder(View view){
        String msg="Total: $"+quantity*5+"\nThank you!";
        displayMessage(msg);

    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /*This method displays the given quantity value on the screen*/
    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));


    }
}