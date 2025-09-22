package com.hitorime.Shape;

import com.hitorime.Interface.Shape;

public class Triangle implements Shape {

    private double base;
    private double height;
    private double area;

    public void calculateArea(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = 0.5 * this.base * this.height;
    }

    @Override
    public void getArea() {
        System.out.println("Triangle Angle: " + this.area);
    }

}
