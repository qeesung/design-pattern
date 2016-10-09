package decorator_pattern.sample.coffee;

import decorator_pattern.sample.Baverage;

/**
 * Created by qeesung on 2016/10/9.
 */
public class HouseBlend extends Baverage{
    public HouseBlend(){
        this.description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
