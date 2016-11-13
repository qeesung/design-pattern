package template_method_pattern.sample;

/**
 * Created by qeesung on 2016/11/14.
 */
public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
