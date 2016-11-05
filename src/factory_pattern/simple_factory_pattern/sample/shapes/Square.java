package factory_pattern.simple_factory_pattern.sample.shapes;

import factory_pattern.simple_factory_pattern.sample.Shape;

/**
 * Created by qeesung on 2016/11/5.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing square");
    }
}
