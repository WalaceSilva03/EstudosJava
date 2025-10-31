package javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L);
        System.out.println(date.getTime());
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
