package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Вывести на экран текущую дату в аналогичном виде "21 02 2014".*/
public class DateToday {

    public static void main(String[] args) {
        //напишите тут ваш код
        String pattern = "dd MM yyyy"; // time pattern
        SimpleDateFormat todayIs = new SimpleDateFormat(pattern);
        System.out.println(todayIs.format(new Date()));
    }
}