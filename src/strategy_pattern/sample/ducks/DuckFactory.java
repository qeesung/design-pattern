package strategy_pattern.sample.ducks;

import strategy_pattern.sample.Duck;

/**
 * Created by qeesung on 2016/9/17.
 */
public class DuckFactory {
    public static Duck getDuck(String duckName){
        switch (duckName){
            case "mallard":
                return new MallardDuck();
            case "mute":
                return new MuteDuck();
            case "redhead":
                return new RedheadDuck();
            case "rocket":
                return new RocketDuck();
            case "rubber":
                return new RubberDuck();
        }
        return new Duck();
    }
}
