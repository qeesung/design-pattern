package factory_pattern.abstract_factory_pattern.phones;

import factory_pattern.abstract_factory_pattern.ApplePhone;

/**
 * Created by qeesung on 2016/11/6.
 */
public class ThreeGApplePhone extends ApplePhone {
    @Override
    public void installIOSSystem() {
        System.out.println("installing 3g adapter ios");
    }

    @Override
    public void chooseNetwork() {
        System.out.println("using 3g net");
    }
}
