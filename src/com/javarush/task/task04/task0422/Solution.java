package com.javarush.task.task04.task0422;
/*Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18 ничего не выводить.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Whats yours name?");
        String name = reader.readLine();
        //System.out.println("How old are you?");
        String ageS = reader.readLine();
        int age = Integer.parseInt(ageS);
        if (age < 18)
            System.out.println("Подрасти еще");


    }
}