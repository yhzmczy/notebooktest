package com.yhzmczy.test.function;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.concurrent.CountDownLatch;

public class Excutor {
    //线程池控制
    private CountDownLatch latch = new CountDownLatch(5);
    //插入方法调用
    public void insert() throws InterruptedException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config/appli*");
        MongoTemplate template=context.getBean("mongoTemplate",MongoTemplate.class);

        long startTime= System.currentTimeMillis();

        MongoTemplateFunction.insertByMultithreading(1000000,10,template,latch);

        latch.await();
        long duration = (System.currentTimeMillis() - startTime)/1000;
        System.out.println(duration);
        MongoTemplateFunction.fixedThreadPool.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        Excutor excutor=new Excutor();
        excutor.insert();
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config/appli*");
//        MongoTemplate template=context.getBean("mongoTemplate",MongoTemplate.class);
//        long startTime= System.currentTimeMillis();
//        MongoTemplateFunction m = new MongoTemplateFunction();
////        m.insertByOne(1000000,template);
//        m.insertByList(1000000,template);
//        long duration = (System.currentTimeMillis() - startTime)/1000;
//        System.out.println(duration);
    }
}
