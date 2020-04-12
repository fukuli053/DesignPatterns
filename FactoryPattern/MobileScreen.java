package com.furkanergun;

//ConcreteProduct
public class MobileScreen implements IScreen{
    @Override
    public void Draw() {
        System.out.println("Mobile Ekranı...");
    }
}
