package com.example.android.justjava;

/**
 * Created by jozca on 2/2/2018.
 */

public class Order {

    private int coffeCount;
    public  Order(){
        coffeCount = 0;
    }

    public  void add(){
        ++coffeCount;
    }
    public  void subtract(){
        if(coffeCount > 0 )
        --coffeCount;
    }

    public  int currentCoffeeCount(){
        return  coffeCount;
    }

}
