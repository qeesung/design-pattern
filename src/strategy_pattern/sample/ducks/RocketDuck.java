package strategy_pattern.sample.ducks;

import strategy_pattern.sample.Duck;
import strategy_pattern.sample.behaviors.fly_behaviors.FlyWithRocket;
import strategy_pattern.sample.behaviors.quack_behaviors.QuackWithBB;

/**
 * Created by qeesung on 2016/9/17.
 */
public class RocketDuck extends Duck {
    public RocketDuck(){
        this.setFlyBehavior(new FlyWithRocket());
        this.setQuackBehavior(new QuackWithBB());
    }
    @Override
    public void display() {
        System.out.println("I am rocket duck");
    }
}
