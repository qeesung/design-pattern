package decorator_pattern.sample.decorator;

import decorator_pattern.sample.Baverage;

/**
 * Created by qeesung on 2016/10/9.
 */
public abstract class CondimentDecorator extends Baverage{
    public abstract String getDescription();
}
