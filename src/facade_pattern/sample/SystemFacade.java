package facade_pattern.sample;

import facade_pattern.sample.sub_systems.SystemA;
import facade_pattern.sample.sub_systems.SystemB;
import facade_pattern.sample.sub_systems.SystemC;

/**
 * Created by qeesung on 2016/11/13.
 */
public class SystemFacade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;
    public SystemFacade(SystemA a, SystemB b , SystemC c){
        this.systemA = a;
        this.systemB = b;
        this.systemC = c;
        }

    public void wrapperOperations(){
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
