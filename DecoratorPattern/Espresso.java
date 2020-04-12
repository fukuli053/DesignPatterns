package com.furkanergun;

public class Espresso extends Beverage {

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return 10;
    }
}
