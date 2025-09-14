package com.hitorime;

//[step 2] subject defines the interface for managing observer registration and notification
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
