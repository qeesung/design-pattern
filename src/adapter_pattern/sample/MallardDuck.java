package adapter_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
