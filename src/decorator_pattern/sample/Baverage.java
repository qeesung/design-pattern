package decorator_pattern.sample;

/**
 * Created by qeesung on 2016/10/9.
 */
public abstract class Baverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
