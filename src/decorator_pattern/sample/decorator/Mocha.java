package decorator_pattern.sample.decorator;

import decorator_pattern.sample.Baverage;

/**
 * Created by qeesung on 2016/10/9.
 */
public class Mocha extends CondimentDecorator {
    Baverage baverage = null;
    public Mocha(Baverage baverage){
        this.baverage = baverage;
    }
    @Override
    public String getDescription() {
        return this.baverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return baverage.cost() + 0.20;
    }
}
