package com.furkanergun;

//ConcreteProduct
public class MonitorScreen implements IScreen{
    @Override
    public void Draw() {
        System.out.println("Monitör Ekranı...");
    }
}
