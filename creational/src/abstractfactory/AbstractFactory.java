package abstractfactory;

import abstractfactory.model.color.Color;
import abstractfactory.model.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shapeType);
}
