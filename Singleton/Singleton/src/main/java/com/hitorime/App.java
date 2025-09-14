package com.hitorime;

public class App {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setTitle("Hello, World!");
        System.out.println(singleton.getTitle());

    }
}