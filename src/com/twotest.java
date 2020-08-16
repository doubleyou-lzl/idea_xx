package com;

import org.junit.Test;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class twotest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(Month.JANUARY);
        LocalDate of = LocalDate.of(2033, 11, 12);
        System.out.println(of);
        LocalDate parse = LocalDate.parse("2222-12-15");
        System.out.println(parse.minusMonths(2));

        System.out.println("--------------");
        System.out.println(of);
        ArrayList<LocalDate> list = new ArrayList<>();
        list.add(of);
        System.out.println("list::::1---------"+list.get(0));
        of=of.withYear(12);
        System.out.println(of);
        System.out.println("list::::2---------"+list.get(0));
    }
    @Test
    public void fun() throws CloneNotSupportedException {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("qw");
        System.out.println(stringBuilder);
        int i = Integer.parseInt("11");
        System.out.println(i);
        String s = String.valueOf(123);
        System.out.println(s);
        User user = new User();
        User clone = (User) user.clone();
        Product product = new Product();

    }
    @Test
    public void fun2()  {




    }
}
