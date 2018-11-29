package com.javarush.task.task05.task0529.task0530;
/*Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.*/
import java.io.*;
public class SumCorrect {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
