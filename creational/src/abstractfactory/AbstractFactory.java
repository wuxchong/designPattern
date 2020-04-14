package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shapeType);
}
