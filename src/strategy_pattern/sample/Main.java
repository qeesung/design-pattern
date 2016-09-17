package strategy_pattern.sample;

import strategy_pattern.sample.ducks.DuckFactory;

/**
 * Created by qeesung on 2016/9/17.
 */
public class Main {
    public static void main(String ... arg){
        String [] duckList = {"mallard","mute","redhead","rocket","rubber"};
        for (String duckName :
                duckList) {
            Duck duck = DuckFactory.getDuck(duckName);
            System.out.println("+++++++++++++++++++++ "+duckName+" +++++++++++++++++++++");
            duck.display();
            duck.flyBehavior();
            duck.quackBehavior();
            System.out.println();
        }
    }
}
