package com.hitorime;

public class App {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getTitle());

    }
}