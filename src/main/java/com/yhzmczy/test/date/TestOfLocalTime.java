package com.yhzmczy.test.date;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class TestOfLocalTime {

  public static void main(String[] args) {
    LocalTime localTime = LocalTime.of(10, 10, 10);
    int hour = localTime.getHour();
    int minute = localTime.getMinute();
    int second = localTime.getSecond();

    int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
    int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);
    int minute2 = localTime.get(ChronoField.MINUTE_OF_DAY);
    int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);
    int second2 = localTime.get(ChronoField.SECOND_OF_DAY);

    LocalTime parseTime = LocalTime.parse("10:10:10");
    boolean b1 = localTime.isAfter(parseTime);
    boolean b2 = localTime.isBefore(parseTime);
    boolean b3 = localTime.equals(parseTime);

    System.out.println();
  }
}
