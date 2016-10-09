package decorator_pattern.sample.coffee;

import decorator_pattern.sample.Baverage;

/**
 * Created by qeesung on 2016/10/9.
 */
public class Espresso extends Baverage{
    public Espresso(){
        this.description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
