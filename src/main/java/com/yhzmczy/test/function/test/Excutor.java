package com.yhzmczy.test.function.test;

import com.yhzmczy.test.bean.test.Book;
import com.yhzmczy.test.bean.test.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.Random;

public class Excutor {

    public static User buildUser(int i){
        User user = new User();
        Random random = new Random();
        user.setAge(random.nextInt(100));
        user.setId(1);

        Book b1 = new Book();
        b1.setBookName("Daily Sun");
        b1.setPrice(10);

        Book b2 = new Book();
        b2.setBookName("Hello China!");
        b2.setPrice(20);

        user.getBooks().add(b1);
        user.getBooks().add(b2);

        return user;
    }

    public static void insert(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config/appli*");
        MongoTemplate template=context.getBean("mongoTemplate",MongoTemplate.class);

        template.insert(Excutor.buildUser(1));
    }

    public static void main(String[] args) {
        insert();
    }
}
