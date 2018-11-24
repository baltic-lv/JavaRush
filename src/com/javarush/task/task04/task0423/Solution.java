package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
•	Если возраст меньше либо равно 20 ничего не выводить.*/


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Whats yours name?");
        String name = reader.readLine();
        //System.out.println("How old are you?");
        String ageS = reader.readLine();
        int age = Integer.parseInt(ageS);
        if (age > 20)
            System.out.println("И 18-ти достаточно");
    }
}