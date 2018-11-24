package com.javarush.task.task02.task0129;

/*Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.*/
public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double pi = 3.14d;
        System.out.println(2*pi*radius);
    }
}
