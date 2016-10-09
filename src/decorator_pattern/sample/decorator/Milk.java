package decorator_pattern.sample.decorator;

import decorator_pattern.sample.Baverage;

/**
 * Created by qeesung on 2016/10/9.
 */
public class Milk extends CondimentDecorator{
    Baverage baverage = null;
    public Milk(Baverage baverage){
        this.baverage = baverage;
    }
    @Override
    public String getDescription() {
        return baverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return baverage.cost()+0.1;
    }
}
