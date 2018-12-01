package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Текущая реализация: Программа вводит два числа с клавиатуры
и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит
минимальное из них на экран.*/
public class MinimumOf5 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int minimum = 0;
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 4; i++) {
            int b = Integer.parseInt(reader.readLine());
            minimum = min(a, b);
            a = minimum;
        }


        //int b = Integer.parseInt(reader.readLine());


        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
