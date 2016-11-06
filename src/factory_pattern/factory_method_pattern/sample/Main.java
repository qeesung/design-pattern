package factory_pattern.factory_method_pattern.sample;

import factory_pattern.factory_method_pattern.sample.pizzastores.HKPizzaStore;
import factory_pattern.factory_method_pattern.sample.pizzastores.NYPizzaStore;

/**
 * Created by qeesung on 2016/11/6.
 */
public class Main {
    public static void main(String ... args){
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza1 = nyStore.orderPizza("type1");
        Pizza pizza2 = nyStore.orderPizza("type2");

        PizzaStore hkStore= new HKPizzaStore();
        Pizza pizza3 = hkStore.orderPizza("type1");
        Pizza pizza4 = hkStore.orderPizza("type2");
    }
}
