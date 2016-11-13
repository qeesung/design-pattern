package adapter_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }
}
