package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

   Order order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        order = new Order();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){

        display(order.currentCoffeeCount());
        displayMessage();
    }

    public void increaseOrder(View view){
        order.add();
        display(order.currentCoffeeCount());
        displayMessage();

    }
    public void decreaseOrder(View view){
        order.subtract();
        display(order.currentCoffeeCount());
        displayMessage();
    }


    private  void display(int number){
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private  void displayMessage(){
        String amount_final_msg = String.format("Amount due:$%s",order.currentCoffeeCount() * 3);
        amount_final_msg = amount_final_msg + "\nThank You.";
        TextView priceTextView = findViewById(R.id.quantity_price_text_view);
        priceTextView.setText(amount_final_msg);
    }
    //private void displayPrice(int number){
      //  TextView priceTextView = findViewById(R.id.quantity_price_text_view);
        //priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    //}
}
