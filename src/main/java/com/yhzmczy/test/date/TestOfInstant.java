package com.yhzmczy.test.date;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class TestOfInstant {

  public static void main(String[] args) {
    Instant instant = Instant.now();
    Instant instant1 = Instant.parse("2018-09-29T03:02:53.412Z"); // 注意此处的字符串格式
    OffsetDateTime offsetDateTime = Instant.now().atOffset(ZoneOffset.ofHours(8));
    int dayOfYear = instant.get(ChronoField.DAY_OF_YEAR);
  }
}
