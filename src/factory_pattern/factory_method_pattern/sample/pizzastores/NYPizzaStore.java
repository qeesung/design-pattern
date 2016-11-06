package factory_pattern.factory_method_pattern.sample.pizzastores;

import factory_pattern.factory_method_pattern.sample.Pizza;
import factory_pattern.factory_method_pattern.sample.PizzaStore;
import factory_pattern.factory_method_pattern.sample.pizzas.NYPizza1;
import factory_pattern.factory_method_pattern.sample.pizzas.NYPizza2;

/**
 * Created by qeesung on 2016/11/6.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case "type1":
                return new NYPizza1();
            case "type2":
                return new NYPizza2();
            default:
                return null;
        }
    }
}
