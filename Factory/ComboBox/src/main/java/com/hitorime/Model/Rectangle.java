package com.hitorime.Model;

import com.hitorime.Interface.Shape;
import javafx.scene.Node;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    @Override
    public Node create() {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(200,100);
        rectangle.setFill(Color.BLACK);
        return rectangle;
    }

}
