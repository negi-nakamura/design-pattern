package com.hitorime;

import java.util.ArrayList;

//[step 4] concrete subject implements the subject interface and defines how to handle registration and notification
public class ConcreteSubject implements Subject{

    ArrayList<Observer> observerArrayList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerArrayList) {
            observer.update();
        }
    }

}
