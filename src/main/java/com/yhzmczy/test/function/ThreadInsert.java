package com.yhzmczy.test.function;

import com.yhzmczy.test.bean.EMSOnuBean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadInsert implements Runnable {
    int start,end;
    MongoTemplate template;
    CountDownLatch countDownLatch;
    ThreadInsert(int s, int e, MongoTemplate t, CountDownLatch c)
    {
        this.start = s;
        this.end = e;
        this.template = t;
        this.countDownLatch = c;
    }

    public void run() {
        System.out.println("开始执行");
        List<EMSOnuBean> list = new ArrayList<EMSOnuBean>();
        for (int i = start; i < end; i++) {
            EMSOnuBean onu = BuildOnu.buildOnu(i);
            template.insert(onu);
//            list.add(onu);
        }
//        System.out.println(Thread.currentThread().getId()+":"+list.size()+" onus");
//        template.insert(list,EMSOnuBean.class);
//        System.out.println("开始插入");
////        template.insertAll(list);
//        System.out.println("插入完成");
        countDownLatch.countDown();
        System.out.println(countDownLatch.toString());
    }
}
