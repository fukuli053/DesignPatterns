package com.furkanergun;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(); //Sensör sınıfımız (observable)

        Phone phone = new Phone(station);   //Telefon nesnesi(observer), paramtre olarak sensör sınıfını (observable) alıyor.
        Web web = new Web(station);         //Web nesnesi(observer), paramtre olarak sensör sınıfını (observable) alıyor.

        station.addObserve(phone);  //Observable sınıfımıza izleyici ekliyoruz.
        station.addObserve(web);

        station.notifyObserver();   //Observable sınıfımız tüm observerlara değerin değiştiğini bildiriyor.
    }
}
