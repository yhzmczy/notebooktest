package com.yhzmczy.test.date;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TestOfTemporalAdjuster {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2018, Month.AUGUST, 31);
    LocalDate localDate1 = localDate.with(nextOrSame(DayOfWeek.SUNDAY));
    LocalDate localDate2 = localDate.with(lastDayOfMonth());
    LocalDate localDate3 = localDate.with(new NextWorkingDay());
    System.out.println();
  }

  private static class NextWorkingDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
      DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
      int dayToAdd = 1;
      if (dow == DayOfWeek.FRIDAY) {
        dayToAdd = 3;
      }
      if (dow == DayOfWeek.SATURDAY) {
        dayToAdd = 2;
      }
      return temporal.plus(dayToAdd, ChronoUnit.DAYS);
    }
  }
}


