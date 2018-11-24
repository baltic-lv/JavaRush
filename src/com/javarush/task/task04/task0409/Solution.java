package com.javarush.task.task04.task0409;

/*Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.

Требования:
•	Программа должна выводить числа на экран.
•	Метод main не должен вызывать System.out.println() или System.out.print().
•	Метод main должен вызывать метод displayClosestToTen.
•	Метод displayClosestToTen должен вызывать метод abs.
•	Метод displayClosestToTen должен выводить число на экран согласно заданию.*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11); //8-10 / 11-10 -> 11
        displayClosestToTen(7, 14); // 7-10 / 14-10 -> 7

    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int distA = a - 10;
        distA = abs(distA);

        int distB = b - 10;
        distB = abs(distB);

        if (distA < distB)
            System.out.println(a);
        else if (distA > distB)
            System.out.println(b);
        else
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}

