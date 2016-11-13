package adapter_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am fly a short distance");
    }
}
