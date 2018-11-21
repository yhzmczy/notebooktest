package com.yhzmczy.test.function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class DateTimeTest {

    /***
     *
     * @param args
     * @since 1.8
     */
    public static void main(String[] args) {
//        //年份从1900开始，月份从0开始，比较奇葩
//        Date date = new Date(118,1,1);
//        System.out.println(date);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2018,1,1);
//        System.out.println(calendar.getWeekYear()+"");

//        System.out.println(LocalDate.now().toString());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate = LocalDate.parse("2018.10.10",formatter);

        System.out.println(localDate.toString());

    }
}
