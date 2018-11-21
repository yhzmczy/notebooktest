package com.yhzmczy.test.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestOfDuration {

  public static void main(String[] args) {
    Instant instant1 = Instant.now();
    Instant instant2 = instant1.plus(Duration.ofDays(1));
    Duration duration = Duration.between(instant1, instant2);
    long between1 = duration.toMillis();
    long between2 = duration.getSeconds();
    long between3 = duration.toMinutes();
    long between4 = duration.toHours();
    long between5 = duration.toDays();
    System.out.println("millis between:"+between1);
    System.out.println("seconds between:"+between2);
    System.out.println("minutes between:"+between3);
    System.out.println("hour between:"+between4);
    System.out.println("days between:"+between5);

    Duration twoHours = Duration.ofHours(2);

    LocalTime localTime1 = LocalTime.now();
    LocalTime localTime2 = localTime1.plus(twoHours);
    Duration duration1 = Duration.between(localTime1, localTime2);
    System.out.println("LocalTime Duration: " + duration1);

    LocalDateTime localDateTime1 = LocalDateTime.now();
    LocalDateTime localDateTime12 = localDateTime1.plus(twoHours);
    Duration duration2 = Duration.between(localDateTime1, localDateTime12);
    System.out.println("LocalDateTime Duration: " + duration2);

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = localDate1.plus(twoHours);
    // java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
    Duration duration3 = Duration.between(localDate1, localDate2);
    System.out.println("LocalDate Duration: " + duration3);
  }
}
