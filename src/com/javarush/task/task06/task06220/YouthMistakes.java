package com.javarush.task.task06.task06220;
/*Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде
 "The max is 25".*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
*/

public class YouthMistakes {
    //public static int max = 100;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String maxS = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = a > b ? a : b;

        System.out.println(maxS + max);
    }
}

