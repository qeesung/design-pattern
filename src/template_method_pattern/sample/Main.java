package template_method_pattern.sample;

/**
 * Created by qeesung on 2016/11/14.
 */
public class Main {
    public static void main(String ... args){
        CaffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();

        System.out.println();

        CaffeineBeverage beverage1 = new Coffee();
        beverage1.prepareRecipe();
    }
}
