package com.javarush.task.task03.task0133;

/*Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30.
 Выведи результат на экран.*/
public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = (15 * 60 + 30 - 15 * 60) * 60;
        System.out.println(secondsAfter15);

    }
}
