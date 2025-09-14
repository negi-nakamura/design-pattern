package com.hitorime;

public class App {
    public static void main(String[] args) {

        ConcreteSubject subjectImplementation = new ConcreteSubject();

        subjectImplementation.registerObserver(new ConcreteObserver("Hello, Earth!"));
        subjectImplementation.registerObserver(new ConcreteObserver("Hello, Mars!"));
        subjectImplementation.registerObserver(new ConcreteObserver("Hello, Saturn!"));

        subjectImplementation.notifyObservers();
        
    }
}