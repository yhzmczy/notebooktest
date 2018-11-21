package com.yhzmczy.test.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestOfLocalDateTime {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2018, 9, 29);
    LocalTime localTime = LocalTime.of(10, 10, 10);

    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    LocalDateTime localDateTime1 = localDate.atTime(localTime);
    LocalDateTime localDateTime2 = localTime.atDate(localDate);

    LocalDateTime now = LocalDateTime.now();
    LocalDate localDate1 = now.toLocalDate();
    LocalTime localTime1 = now.toLocalTime();

    boolean b1 = now.isEqual(localDateTime);
    boolean b2 = now.isBefore(localDateTime);
    boolean b3 = now.isAfter(localDateTime);

    System.out.println();
  }
}
