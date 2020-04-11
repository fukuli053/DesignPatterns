package com.furkanergun;

public interface Observable {
    void addObserve(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

