package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Каждое значение с новой строки.*/
public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        int N = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i < N){
            System.out.println(inputString);
            i++;
        }
    }
}
