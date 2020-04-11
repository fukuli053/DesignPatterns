package com.furkanergun;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserve(Observer observer) {
        observerList.add(observer);     // Sensör izleyicilerini eklemek için.
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);  // Sensör izleyicilerini silmek için.
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :
                observerList) {
            observer.update();      //Sensördeki her izleyiciye sıcaklık bilgisinin değiştiğini bildirir.
        }
    }

    public int getTemperature(){
        return 53;   //Sıcaklık sensöründen gelen örnek değer.
    }
}
