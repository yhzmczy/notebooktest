package com.yhzmczy.test.function;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    private static final CountDownLatch latch = new CountDownLatch(10);

    public void data() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0;i<10;i++){

            Runnable runnable = new Runnable() {
                public void run() {
                    System.out.println("++");
                    latch.countDown();
                }
            };
            executorService.submit(runnable);
        }

        latch.await();
        System.out.println("end");
        executorService.shutdown();

    }

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        demo.data();
    }
}
