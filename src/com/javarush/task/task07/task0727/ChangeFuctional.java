package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.*/

public class ChangeFuctional {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()) break;
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            int lenStr = list.get(i).length();
            if (lenStr % 2 == 0)
                list.set(i, list.get(i) + " " + list.get(i));
            else
                list.set(i, (list.get(i) + " " + list.get(i)) + " " + list.get(i));
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


