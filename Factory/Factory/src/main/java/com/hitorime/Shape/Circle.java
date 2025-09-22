package com.hitorime.Shape;

import com.hitorime.Interface.Shape;

//[step 2] concrete class implements the interface
public class Circle implements Shape {

    private double radius;
    private double area;

    public void calculateArea(double radius) {
        this.radius = radius;
        this.area = Math.PI * this.radius * this.radius;
    }

    @Override
    public void getArea() {
        System.out.println("Circle Area: " + this.area);
    }

}
