package factory_pattern.simple_factory_pattern.sample;

import factory_pattern.simple_factory_pattern.sample.shapes.Circle;
import factory_pattern.simple_factory_pattern.sample.shapes.Rectangle;
import factory_pattern.simple_factory_pattern.sample.shapes.Square;

/**
 * Created by qeesung on 2016/11/5.
 */
public class SimpleShapeFactory {
    public Shape createShape(String shapeName){
        switch (shapeName) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
        }
        return null;
    }
}
