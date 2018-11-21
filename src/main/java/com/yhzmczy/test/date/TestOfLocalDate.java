package com.yhzmczy.test.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class TestOfLocalDate {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2018, 9, 29);
    int year = localDate.getYear();
    Month month = localDate.getMonth();
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    int dayOfMonth = localDate.getDayOfMonth();
    int dayOfYear = localDate.getDayOfYear();
    int lengthOfMonth = localDate.lengthOfMonth();
    int lengthOfYear = localDate.lengthOfYear();
    boolean leap = localDate.isLeapYear();

    int year1 = localDate.get(ChronoField.YEAR);
    int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
    int dayOfMonth1 = localDate.get(ChronoField.DAY_OF_MONTH);
    int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
    int dayOfYear1 = localDate.get(ChronoField.DAY_OF_YEAR);

    LocalDate now = LocalDate.now();
    LocalDate max = LocalDate.MAX;
    LocalDate min = LocalDate.MIN;
    // based on the epoch 1970-01-01
    LocalDate epochDay = LocalDate.ofEpochDay(1);
    LocalDate parseDay = LocalDate.parse("2018-09-01");
    boolean b1 = localDate.isEqual(epochDay);
    boolean b2 = localDate.isBefore(parseDay);
    boolean b3 = localDate.isAfter(epochDay);

    System.out.println();
  }
}
