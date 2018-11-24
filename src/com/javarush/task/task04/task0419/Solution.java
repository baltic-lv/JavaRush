package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное из четырёх чисел.
•	Если максимальных чисел несколько, необходимо вывести любое из них.*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String aS = reader.readLine();
        int a = Integer.parseInt(aS);
        int max = a;
        String bS = reader.readLine();
        int b = Integer.parseInt(bS);
        String cS = reader.readLine();
        int c = Integer.parseInt(cS);
        String dS = reader.readLine();
        int d = Integer.parseInt(dS);

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        System.out.println(max);

    }
}

