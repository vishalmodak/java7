package com.foo.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Long[] sleepTimes = {5000l, 3000l, 6000l, 7000l, 1000l, 4000l, 8000l, 9000l, 1000l, 2000l};
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        List<Future<String>> futures = new ArrayList<Future<String>>(10);

        for(int i = 0; i < 10; i++){
            futures.add(threadPool.submit(new StringTask(sleepTimes[i], i)));
         }

        for(Future<String> future : futures) {
            String result = future.get();
            System.out.println(result);
        }
        
        threadPool.shutdown();
    }
}
