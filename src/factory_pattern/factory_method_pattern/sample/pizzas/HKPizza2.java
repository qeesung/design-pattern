package factory_pattern.factory_method_pattern.sample.pizzas;

import factory_pattern.factory_method_pattern.sample.Pizza;

/**
 * Created by qeesung on 2016/11/6.
 */
public class HKPizza2 implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare hong kong pizza2");
    }

    @Override
    public void bake() {
        System.out.println("bake hong kong pizza2");
    }

    @Override
    public void cut() {
        System.out.println("cut hong kong pizza2");
    }

    @Override
    public void box() {
        System.out.println("box hong kong pizza2");
    }
}
