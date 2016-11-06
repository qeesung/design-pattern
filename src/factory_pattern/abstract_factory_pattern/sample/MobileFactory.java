package factory_pattern.abstract_factory_pattern.sample;

/**
 * Created by qeesung on 2016/11/6.
 */
public abstract class MobileFactory {
    public abstract NokiaPhone createNokiaPhone(String type);
    public abstract ApplePhone createApplePhone(String type);
}
