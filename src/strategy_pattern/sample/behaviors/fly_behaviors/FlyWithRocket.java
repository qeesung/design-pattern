package strategy_pattern.sample.behaviors.fly_behaviors;

import strategy_pattern.sample.behaviors.FlyBehaviorInterface;

/**
 * Created by qeesung on 2016/9/17.
 */
public class FlyWithRocket implements FlyBehaviorInterface {
    @Override
    public void fly() {
        System.out.println("sou~~~~~~~~~~~~~~~~~~~ with the rocket");
    }
}
