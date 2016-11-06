package factory_pattern.abstract_factory_pattern.sample.phones;

import factory_pattern.abstract_factory_pattern.sample.ApplePhone;

/**
 * Created by qeesung on 2016/11/6.
 */
public class FourGApplePhone extends ApplePhone {
    @Override
    public void installIOSSystem() {
        System.out.println("installing 4g adapter ios");
    }

    @Override
    public void chooseNetwork() {
        System.out.println("using 4g net");
    }
}
