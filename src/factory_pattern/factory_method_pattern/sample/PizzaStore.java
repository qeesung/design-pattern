package factory_pattern.factory_method_pattern.sample;

/**
 * Created by qeesung on 2016/11/6.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        if(pizza == null)
        {
            System.out.println("create pizza failed");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
