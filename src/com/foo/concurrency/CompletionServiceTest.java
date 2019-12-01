package com.foo.concurrency;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletionServiceTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Long[] sleepTimes = {5000l, 3000l, 6000l, 7000l, 1000l, 4000l, 8000l, 9000l, 1000l, 2000l};
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        CompletionService<String> pool = new ExecutorCompletionService<String>(threadPool);

        for(int i = 0; i < 10; i++){
           pool.submit(new StringTask(sleepTimes[i], i));
        }

        for(int i = 0; i < 10; i++){
           String result = pool.take().get();
           System.out.println(result);
        }
        
        threadPool.shutdown();
    }
}
