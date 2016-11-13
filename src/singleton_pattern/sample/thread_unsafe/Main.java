package singleton_pattern.sample.thread_unsafe;

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
        // multi thread results, have different uuid means have different instance
        //[26381512-92f6-4e15-b1fe-7ef7917d3ca6]:hello world
        //[14db888c-05e0-4034-9caa-93f9f8ebbcc0]:hello world
        //[7ea99ee7-b047-4448-90b9-f62899624d5d]:hello world
        //[63f75e38-f022-4325-9bbb-648b3846cbfb]:hello world
        //[c5725dd3-c54b-422b-aa4d-4c3d72b2d7f6]:hello world
        //[47f6ab07-97ac-4c36-88b3-09c62ccddbce]:hello world
    }
}

