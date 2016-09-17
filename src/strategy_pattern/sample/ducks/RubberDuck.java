package strategy_pattern.sample.ducks;

import strategy_pattern.sample.Duck;
import strategy_pattern.sample.behaviors.fly_behaviors.FlyNoWay;
import strategy_pattern.sample.behaviors.fly_behaviors.FlyWithWings;
import strategy_pattern.sample.behaviors.quack_behaviors.QuackWithBB;

/**
 * Created by qeesung on 2016/9/17.
 */
public class RubberDuck extends Duck {
    public RubberDuck(){ // change the default behavior
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new QuackWithBB());
    }
    @Override
    public void display() {
        System.out.println("I am Rubber duck");
    }
}
