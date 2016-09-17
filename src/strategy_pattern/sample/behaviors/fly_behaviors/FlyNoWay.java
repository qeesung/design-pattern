package strategy_pattern.sample.behaviors.fly_behaviors;

import strategy_pattern.sample.behaviors.FlyBehaviorInterface;

/**
 * Created by qeesung on 2016/9/17.
 */
public class FlyNoWay implements FlyBehaviorInterface {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
