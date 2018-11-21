package com.yhzmczy.test.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TestOfWith {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate1 = localDate.withYear(2017);
    LocalDate localDate2 = localDate.withDayOfMonth(20);
    LocalDate localDate3 = localDate.with(ChronoField.MONTH_OF_YEAR, 12);
    System.out.println();

  }
}
