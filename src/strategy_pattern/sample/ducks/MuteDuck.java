package strategy_pattern.sample.ducks;

import strategy_pattern.sample.Duck;
import strategy_pattern.sample.behaviors.fly_behaviors.FlyNoWay;
import strategy_pattern.sample.behaviors.quack_behaviors.QuackNoWay;

/**
 * Created by qeesung on 2016/9/17.
 */
public class MuteDuck extends Duck {
    public MuteDuck(){
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new QuackNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am a mute duck");
    }
}
