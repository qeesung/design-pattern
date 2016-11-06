package factory_pattern.factory_method_pattern.sample.pizzastores;

import com.sun.xml.internal.ws.api.pipe.PipelineAssembler;
import factory_pattern.factory_method_pattern.sample.Pizza;
import factory_pattern.factory_method_pattern.sample.PizzaStore;
import factory_pattern.factory_method_pattern.sample.pizzas.HKPizza1;
import factory_pattern.factory_method_pattern.sample.pizzas.HKPizza2;

/**
 * Created by qeesung on 2016/11/6.
 */
public class HKPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case "type1":
                return new HKPizza1();
            case "type2":
                return new HKPizza2();
            default:
                return null;
        }
    }
}
