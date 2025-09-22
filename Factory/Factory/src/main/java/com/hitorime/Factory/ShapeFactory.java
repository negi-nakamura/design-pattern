package com.hitorime.Factory;

import com.hitorime.Shape.Circle;
import com.hitorime.Shape.Rectangle;
import com.hitorime.Interface.Shape;
import com.hitorime.Shape.Triangle;

//[step 3] main object creator of the concrete classes
public class ShapeFactory {

    public Shape createShape(String shapeName) {

        return switch (shapeName.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
            default -> null;
        };

    }
}
