package com.javarush.task.task05.task0531;
/*Текущая реализация: Программа вводит два числа с клавиатуры и
выводит минимальное из них на экран.

Новая задача: Программа вводит пять чисел с клавиатуры
 и выводит минимальное из них на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimumOf5Validate {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        System.out.println("Minimum = " + min(a,b,c,d,e));

    }

    public static int min(int a, int b, int c, int d, int e) {
        int x1 = a < b ? a : b;
        int x2 = x1 < c ? x1 : c;
        int x3 = x2 < d ? x2 : d;
        int minimum = x3 < e ? x3 : e;
        return minimum;


    }
}

