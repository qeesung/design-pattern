package singleton_pattern.sample.thread_safe.single_check;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Main {
    public static void singleThreadTest(){
        LogSingleton.getInstance().log("hello world");
        LogSingleton.getInstance().log("hello world1");
        LogSingleton.getInstance().log("hello world2");
    }

    public static class LogThread extends Thread{
        @Override
        public void run() {
            LogSingleton.getInstance().log("hello world");
        }
    }
    public static void multiThreadTest(){
        for (int i = 0; i < 6; i++) {
            new LogThread().start();
        }
    }
    public static void main(String ... args){
        //singleThreadTest();
        // single thread result, have single uuid
        //[579b2d70-0ecf-4c72-9d01-3a2c28d0d50b]:hello world
        //[579b2d70-0ecf-4c72-9d01-3a2c28d0d50b]:hello world1
        //[579b2d70-0ecf-4c72-9d01-3a2c28d0d50b]:hello world2

        multiThreadTest();
        // multi thread results, have same uuid
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
        //[f90b3a07-04a2-43c7-8e79-b84cbea9b487]:hello world
    }
}
