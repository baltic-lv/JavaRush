package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > 0)
                sum++;
        }
        System.out.println(sum);
    }
}