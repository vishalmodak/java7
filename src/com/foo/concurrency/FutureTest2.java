package com.foo.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<String> f1 = Executors.newSingleThreadExecutor().submit(new StringTask(2000l, 1));
        System.out.println(f1.get());
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                
            }
            
        });

    }

}
