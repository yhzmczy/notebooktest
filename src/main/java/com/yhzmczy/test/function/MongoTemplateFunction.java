package com.yhzmczy.test.function;

import com.yhzmczy.test.bean.EMSOnuBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Repository
public class MongoTemplateFunction {

    //线程池控制
    private static final CountDownLatch latch = new CountDownLatch(10);


    /**
     * 逐个插入对象
     * @param max 插入对象的数量
     * */
    public void insertByOne(int max,MongoTemplate template){
            for (int i = 0; i < max; i++) {
            EMSOnuBean onu = BuildOnu.buildOnu(i);
            template.insert(onu);
        }
    }

    /**
     * 批量插入
     * @param max 插入对象的数量
     * */
    public void insertByList(int max,MongoTemplate template){
        List<EMSOnuBean> list = new ArrayList<EMSOnuBean>();
        for (int i = 0; i < max; i++) {
            list.add(BuildOnu.buildOnu(i));
        }
        template.insert(list,EMSOnuBean.class);
    }

    /**
     * 多线程插入
     * */
    static ExecutorService fixedThreadPool;
    public static void insertByMultithreading(int max, int thread, MongoTemplate template,CountDownLatch latch){
        fixedThreadPool = Executors.newFixedThreadPool(thread);
        for (int i = 0; i < thread; i++) {
            int cut = max/thread;
            ThreadInsert threadInsert = new ThreadInsert(i*cut,(int)((i+1)*cut),template,latch);
            fixedThreadPool.submit(threadInsert);
            System.out.println(fixedThreadPool);
        }

    }

}
