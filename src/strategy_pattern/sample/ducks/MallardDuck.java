package strategy_pattern.sample.ducks;

import strategy_pattern.sample.Duck;

/**
 * Created by qeesung on 2016/9/17.
 */
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a MallardDuck");
    }
}
