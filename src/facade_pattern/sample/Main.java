package facade_pattern.sample;

import facade_pattern.sample.sub_systems.SystemA;
import facade_pattern.sample.sub_systems.SystemB;
import facade_pattern.sample.sub_systems.SystemC;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Main {
    public static void main(String ... args){
        SystemA a = new SystemA();
        SystemB b = new SystemB();
        SystemC c = new SystemC();

        SystemFacade facade = new SystemFacade(a, b, c);
        facade.wrapperOperations();
    }
}
