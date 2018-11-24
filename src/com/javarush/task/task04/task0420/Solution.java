package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine();
        int a = Integer.parseInt(aS);
        int max = a;
        int min;
        int mid;

        String bS = reader.readLine();
        int b = Integer.parseInt(bS);

        if (b > a) {
            min = max;
            max = b;
        } else
            min = b;

        String cS = reader.readLine();
        int c = Integer.parseInt(cS);

        if (c > max) {
            mid = max;
            max = c;

        } else if (c < min) {
            mid = min;
            min = c;
        } else {
            mid = c;
        }
        System.out.println(max + " " + mid + " " + min);
    }
}
