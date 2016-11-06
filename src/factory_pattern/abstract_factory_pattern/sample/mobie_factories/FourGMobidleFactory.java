package factory_pattern.abstract_factory_pattern.sample.mobie_factories;

import factory_pattern.abstract_factory_pattern.sample.ApplePhone;
import factory_pattern.abstract_factory_pattern.sample.MobileFactory;
import factory_pattern.abstract_factory_pattern.sample.NokiaPhone;
import factory_pattern.abstract_factory_pattern.sample.phones.FourGApplePhone;
import factory_pattern.abstract_factory_pattern.sample.phones.FourGNokiaPhone;

/**
 * Created by qeesung on 2016/11/6.
 */
public class FourGMobidleFactory extends MobileFactory {
    @Override
    public NokiaPhone createNokiaPhone(String type) {
        switch (type){
            case "normal":
                return new FourGNokiaPhone();
            /** extend more nokia phone */
            default:
                return null;
        }
    }

    @Override
    public ApplePhone createApplePhone(String type) {
        switch (type){
            case "normal":
                return new FourGApplePhone();
            /** extend more apple here */
            default:
                return null;
        }
    }
}
