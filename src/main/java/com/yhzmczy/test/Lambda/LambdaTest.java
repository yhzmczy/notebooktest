package com.yhzmczy.test.Lambda;

import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello World!");
        Runnable r2 = {

        };
        Thread th = new Thread(r);
        th.start();
    }
}
