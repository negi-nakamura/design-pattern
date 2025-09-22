package com.hitorime.Factory;

import com.hitorime.Interface.Shape;
import com.hitorime.Model.Circle;
import com.hitorime.Model.Rectangle;
import com.hitorime.Model.Triangle;
import javafx.scene.Parent;

public class ShapeFactory {

    public Shape createShape(String shapeName) {
        return switch (shapeName.toLowerCase()) {
            case "triangle" -> new Triangle();
            case "rectangle" -> new Rectangle();
            case "circle" -> new Circle();
            default -> null;
        };
    }

}
