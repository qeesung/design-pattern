package strategy_pattern.sample;

import strategy_pattern.sample.behaviors.FlyBehaviorInterface;
import strategy_pattern.sample.behaviors.QuackBehaviorInterface;
import strategy_pattern.sample.behaviors.fly_behaviors.FlyWithWings;
import strategy_pattern.sample.behaviors.quack_behaviors.QuackWithGG;

/**
 * Created by qeesung on 2016/9/17.
 */
public class Duck {
    private FlyBehaviorInterface flyBehavior;
    private QuackBehaviorInterface quackBehavior;

    public Duck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackWithGG();
    }

    public void display(){
        System.out.println("Basic duck");
    }

    public void flyBehavior(){
        flyBehavior.fly();
    }

    public void quackBehavior(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehaviorInterface flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehaviorInterface quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
