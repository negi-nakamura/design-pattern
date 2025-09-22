package com.hitorime.Model;

import com.hitorime.Interface.Shape;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle implements Shape {

    @Override
    public Node create() {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(100.0, 50.0, 0.0, 200.0, 200.0, 200.0);
        triangle.setFill(Color.BLACK);
        return triangle;
    }

}
