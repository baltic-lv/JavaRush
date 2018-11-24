package com.javarush.task.task04.task0418;
/*Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine();
        int a = Integer.parseInt(aS);
        String bS = reader.readLine();
        int b = Integer.parseInt(bS);

        if (a < b)
            System.out.println(a);
        else if (b < a)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
