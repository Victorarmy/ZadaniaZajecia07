package com.example.exerciseone;

public class ConverterTest {
    public static void main(String[] args) {
        CalendarConverter calendarConverter = new CalendarConverter();
        for (int i = 1; i < 8; i++) {
            System.out.println(i + " dzień tygodnia to " + calendarConverter.convertDayToString(i));
        }
    }
}
