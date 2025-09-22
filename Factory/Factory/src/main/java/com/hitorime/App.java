package com.hitorime;

import com.hitorime.Factory.ShapeFactory;
import com.hitorime.Shape.Circle;
import com.hitorime.Shape.Rectangle;
import com.hitorime.Shape.Triangle;

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = (Rectangle) new ShapeFactory().createShape("rectangle");
        rectangle.calculateArea(10,10);
        rectangle.getArea();

        Triangle triangle = (Triangle) new ShapeFactory().createShape("triangle");
        triangle.calculateArea(10,10);
        triangle.getArea();

        Circle circle = (Circle) new ShapeFactory().createShape("circle");
        circle.calculateArea(10);
        circle.getArea();

    }
}