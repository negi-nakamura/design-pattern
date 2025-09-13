package com.hitorime;

public class Singleton {

     //[step 1] declare a private static variable that holds a single class instance
     private static Singleton instance;
     private String title = "Hello, World!";

     //[step 2] declare a private constructor to prevent external code from creating a new instance
     private Singleton() {

     }

     //[step 3] implement a public static method to provide external access to the same single instance
     public static Singleton getInstance() {
         if(instance == null) instance = new Singleton();
         return instance;
     }

     //[optional] implement necessary methods
     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }
}
