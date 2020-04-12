package com.furkanergun;

//ConcreteProduct
public class TabletScreen implements IScreen{
    @Override
    public void Draw() {
        System.out.println("Tablet Ekranı...");
    }
}
