package com.hitorime.Model;

import com.hitorime.Interface.Shape;
import javafx.scene.Node;
import javafx.scene.paint.Color;

public class Circle implements Shape {

    @Override
    public Node create() {
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle(75);
        circle.setFill(Color.BLACK);
        return circle;
    }

}
