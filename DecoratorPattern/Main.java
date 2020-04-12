package com.furkanergun;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Caramel(new Espresso());

        System.out.println(beverage.getDesc());
        System.out.println(beverage.cost());

    }
}
