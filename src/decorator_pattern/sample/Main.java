package decorator_pattern.sample;

import decorator_pattern.sample.coffee.Espresso;
import decorator_pattern.sample.decorator.Milk;
import decorator_pattern.sample.decorator.Mocha;

/**
 * Created by qeesung on 2016/10/9.
 */
public class Main {
    public static void main(String ... args) {
        Baverage baverage1 = new Espresso();
        System.out.println(baverage1.getDescription()+" cost is " + baverage1.cost());
        System.out.println("> add some mocha");
        baverage1 = new Mocha(baverage1);
        System.out.println(baverage1.getDescription()+" cost is " + baverage1.cost());
        System.out.println("> add some milk");
        baverage1 = new Milk(baverage1);
        System.out.println(baverage1.getDescription()+" cost is " + baverage1.cost());
    }
}
