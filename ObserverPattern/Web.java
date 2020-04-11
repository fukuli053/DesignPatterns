package com.furkanergun;

public class Web implements Observer{
    private WeatherStation station;
    private int temperature;

    public Web(WeatherStation station){
        this.station = station;
        this.temperature = station.getTemperature(); //Başlangıçta derece değeri WeatherStation'dan gelen değer.
    }

    @Override
    public void update() {
        temperature = station.getTemperature();  //WeatherStation notify methodu bu methodu çalıştırır.
        printTemperature();
    }

    public void printTemperature(){
        System.out.println("Web:" + temperature + "Derece !");
    }

    public void removeObserver(){
        station.removeObserver(this);
    }
}
