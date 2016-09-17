package strategy_pattern.sample.behaviors.quack_behaviors;

import strategy_pattern.sample.behaviors.QuackBehaviorInterface;

/**
 * Created by qeesung on 2016/9/17.
 */
public class QuackNoWay implements QuackBehaviorInterface {
    @Override
    public void quack() {
        System.out.println("I can not quack");
    }
}
