package com.hitorime.Shape;

import com.hitorime.Interface.Shape;

public class Rectangle implements Shape {

    private double length;
    private double width;
    private double area;

    public void calculateArea(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle Area: " + this.area);
    }

}
