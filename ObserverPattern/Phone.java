package com.furkanergun;

public class Phone implements Observer {
    private WeatherStation station;
    private int temperature;
    Phone(WeatherStation station){
        this.station = station;
        this.temperature = station.getTemperature(); //Başlangıçta derece değeri WeatherStation'dan gelen değer.
    }

    @Override
    public void update() {
        temperature = station.getTemperature();   //WeatherStation notify methodu bu methodu çalıştırır.
        printTemperature();
    }

    public void printTemperature(){
        System.out.println("Telefon:" + temperature + "Derece !");
    }

    public void removeObserver(){
        station.removeObserver(this);
    }
}
