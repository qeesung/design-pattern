package factory_pattern.factory_method_pattern.sample.pizzas;

import factory_pattern.factory_method_pattern.sample.Pizza;

/**
 * Created by qeesung on 2016/11/6.
 */
public class NYPizza2 implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare new york pizza2");
    }

    @Override
    public void bake() {
        System.out.println("bake new york pizza2");
    }

    @Override
    public void cut() {
        System.out.println("cut new york pizza2");
    }

    @Override
    public void box() {
        System.out.println("box new york pizza2");
    }
}
