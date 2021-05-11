package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ClassWork {
    public static void main(String[] args) {
        Date date = new Date();
        int hours = date.getHours();
        int minutes = date.getMinutes();
        System.out.println(hours+ ":" +minutes);

        ///////////////LocalData/////////////////

        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate localDate = now.plusDays(2);
        System.out.println(localDate);

        int i = now.lengthOfMonth();
        System.out.println(i);


                        /////////LocalTime//////////
        LocalTime now1 = LocalTime.now();
        int nano = now1.getNano();
        System.out.println(nano);

        int hour = now1.getHour();
        int minute = now1.getMinute();
        int second = now1.getSecond();
        System.out.println(hour+":"+minute+":"+second);


        ///////////////////LocalDateTime/////////////////////

        LocalDateTime max = LocalDateTime.MAX;
        System.out.println(max.getDayOfYear());



    }
}
