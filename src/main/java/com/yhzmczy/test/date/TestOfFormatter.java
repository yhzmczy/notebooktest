package com.yhzmczy.test.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestOfFormatter {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
    String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
    LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println("BASIC_ISO_DATE:"+s1);
    System.out.println("ISO_LOCAL_DATE:"+s2);

  }
}
