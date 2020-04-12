package com.furkanergun;

public class Caramel extends AddonDecorator{
    private Beverage beverage;

    public Caramel(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDesc() {
        return "Karamelli" + this.beverage.getDesc();
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
