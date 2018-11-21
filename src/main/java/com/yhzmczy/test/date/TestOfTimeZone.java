package com.yhzmczy.test.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestOfTimeZone {

  public static void main(String[] args) {
    ZoneId defaultZone = ZoneId.systemDefault();
    System.out.println(defaultZone);

    ZoneId usa = ZoneId.of("America/New_York");
    LocalDateTime shanghaiTime = LocalDateTime.now();
    LocalDateTime usaTime = LocalDateTime.now(usa);
    System.out.println(shanghaiTime);
    System.out.println(usaTime);

    // 为时间点添加时区信息
    LocalDate localDate = LocalDate.now();
    ZonedDateTime zdt1 = localDate.atStartOfDay(usa);

    LocalDateTime localDateTime = LocalDateTime.now();
    ZonedDateTime zdt2 = localDateTime.atZone(usa);

    Instant instant = Instant.now();
    ZonedDateTime zdt3 = instant.atZone(usa);
  }
}
