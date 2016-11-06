package factory_pattern.abstract_factory_pattern.mobie_factories;

import factory_pattern.abstract_factory_pattern.ApplePhone;
import factory_pattern.abstract_factory_pattern.MobileFactory;
import factory_pattern.abstract_factory_pattern.NokiaPhone;
import factory_pattern.abstract_factory_pattern.phones.ThreeGApplePhone;
import factory_pattern.abstract_factory_pattern.phones.ThreeGNokiaPhone;

/**
 * Created by qeesung on 2016/11/6.
 */
public class ThreeGMobileFactory extends MobileFactory {
    @Override
    public NokiaPhone createNokiaPhone(String type) {
        switch (type){
            case "normal":
                return new ThreeGNokiaPhone();
            /** extend more 3g nokia here */
            default:
                return null;
        }
    }

    @Override
    public ApplePhone createApplePhone(String type) {
        switch (type){
            case "normal":
                return new ThreeGApplePhone();
            /** extend more 3g apple here */
            default:
                return null;
        }
    }
}
