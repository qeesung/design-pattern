package strategy_pattern.sample.behaviors.quack_behaviors;

import strategy_pattern.sample.behaviors.QuackBehaviorInterface;

/**
 * Created by qeesung on 2016/9/17.
 */
public class QuackWithBB implements QuackBehaviorInterface{
    @Override
    public void quack() {
        System.out.println("BB...BB...");
    }
}
