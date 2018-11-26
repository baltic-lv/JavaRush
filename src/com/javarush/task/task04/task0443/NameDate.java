package com.javarush.task.task04.task0443;
/*Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameDate {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        String month = reader.readLine();
        String day = reader.readLine();

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+day+"."+month+"."+year);
    }
}
