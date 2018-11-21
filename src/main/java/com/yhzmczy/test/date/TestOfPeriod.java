package com.yhzmczy.test.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestOfPeriod {

  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate localDate = LocalDate.of(2017, Month.MARCH, 19);
    Period period = Period.between(localDate, now);
    System.out.printf("间隔:%d 年 %d 月 %d 日", period.getYears(), period.getMonths(), period.getDays());

    long until = localDate.until(now, ChronoUnit.DAYS);
    System.out.println();
  }
}
