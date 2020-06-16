package com.company;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new RoundedRectangle();
        else if (shapeType.equalsIgnoreCase("square")) return new RoundedSquare();
        return null;
    }
}
