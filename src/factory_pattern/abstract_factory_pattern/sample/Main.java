package factory_pattern.abstract_factory_pattern.sample;

import factory_pattern.abstract_factory_pattern.sample.mobie_factories.FourGMobidleFactory;
import factory_pattern.abstract_factory_pattern.sample.mobie_factories.ThreeGMobileFactory;

/**
 * Created by qeesung on 2016/11/6.
 */
public class Main {
    public static void main(String ... args){
        MobileFactory threeGFactory = new ThreeGMobileFactory();
        NokiaPhone phone1 = threeGFactory.createNokiaPhone("normal");
        phone1.installAndroidSystem();
        phone1.chooseNetWork();

        ApplePhone applePhone1 = threeGFactory.createApplePhone("normal");
        applePhone1.installIOSSystem();
        applePhone1.chooseNetwork();

        MobileFactory fourGFactory = new FourGMobidleFactory();
        NokiaPhone phone2 = fourGFactory.createNokiaPhone("normal");
        phone2.installAndroidSystem();
        phone2.chooseNetWork();

        ApplePhone applePhone2 = fourGFactory.createApplePhone("normal");
        applePhone2.installIOSSystem();
        applePhone2.chooseNetwork();
    }
}
