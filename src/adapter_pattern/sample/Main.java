package adapter_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Main {
    public static void main(String ... args){
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey); // adapter the turkey

        duck.quack();
        duck.fly();
    }
}
