package singleton_pattern.sample.thread_unsafe;

import java.util.UUID;

/**
 * Created by qeesung on 2016/11/13.
 */
public class LogSingleton {
    private LogSingleton(){} // private constructor
    private static LogSingleton LOG_SINGLETON = null;
    private UUID uuid = UUID.randomUUID();

    public static LogSingleton getInstance(){
        if(LOG_SINGLETON == null)
            LOG_SINGLETON = new LogSingleton();
        return LOG_SINGLETON;
    }

    public void log(String logInfo){
        System.out.println("["+uuid+"]:"+logInfo);
    }
}
