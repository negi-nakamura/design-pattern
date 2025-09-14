package com.hitorime;

//[step 3] concrete observer implements the observer interface and defines how to handle updates
public class ConcreteObserver implements Observer {

    String message;

    public ConcreteObserver(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        System.out.println(message);
    }

}
