package com.foo.concurrency;

import java.util.concurrent.Callable;

public final class StringTask implements Callable<String> {

    String name;
    long sleep;
    
    public StringTask(long sleepTime, int id) {
        name = "StringTask"+id;
        sleep = sleepTime;
    }
    
    public String call() throws InterruptedException{
       System.out.println(name + " doing some work for " + sleep/1000 + " seconds");
       Thread.sleep(sleep);
       return name + " is Done";
    }
}

