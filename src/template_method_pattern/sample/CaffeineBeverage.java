package template_method_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe(){ // some fixed processes
        brew();
        boilWater();
        addCondiments();
        pourInCup();
    }

    // need override in sub class
    public abstract void brew();
    public abstract void addCondiments();

    // methods shared by subclass
    public void boilWater(){
        System.out.println("boiling water");
    }

    public void pourInCup(){
        System.out.println("poring into cup");
    }

}
