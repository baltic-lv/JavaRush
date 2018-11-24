package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter yours Name, please: ");
        String name = reader.readLine();
        System.out.println("Enter yours Age, please: ");
        String age = reader.readLine();

        System.out.println(name + " захватит мир через " + age + " лет. " +
                "Му-ха-ха!");
    }
}