package factory_pattern.simple_factory_pattern.sample;

/**
 * Created by qeesung on 2016/11/5.
 */
public class Main {
    public static void main(String ... args){
        SimpleShapeFactory factory = new SimpleShapeFactory();
        String [] shapes = new String[]{"circle","rectangle","square"};
        for (String shapeName :
                shapes) {
            // start to create shape
            factory.createShape(shapeName).draw();
        }
    }
}
