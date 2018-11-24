package com.javarush.task.task04.task0426;
/*Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if ((num > 0) && (num % 2 == 0))
            System.out.println("положительное четное число");
        else if ((num > 0) && (num % 2 == 1))
            System.out.println("положительное нечетное число");
        else if ((num < 0) && (Math.abs(num) % 2 == 0))
            System.out.println("отрицательное четное число");
        else if ((num < 0) && (Math.abs(num) % 2 == 1))
            System.out.println("отрицательное нечетное число");
        else
            System.out.println("ноль");

    }
}
