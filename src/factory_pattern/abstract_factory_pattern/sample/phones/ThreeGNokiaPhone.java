package factory_pattern.abstract_factory_pattern.sample.phones;

import factory_pattern.abstract_factory_pattern.sample.NokiaPhone;

/**
 * Created by qeesung on 2016/11/6.
 */
public class ThreeGNokiaPhone extends NokiaPhone {
    @Override
    public void installAndroidSystem() {
        System.out.println("installing 3g adapter android");
    }

    @Override
    public void chooseNetWork() {
        System.out.println("using 3g net");
    }
}
