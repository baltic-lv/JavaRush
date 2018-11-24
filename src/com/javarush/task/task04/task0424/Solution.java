package com.javarush.task.task04.task0424;
/*Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других,
 равных между собой. Вывести на экран порядковый номер числа,
  отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 == num2 && num3 != num1)
            System.out.println(3);
        else if (num1 == num3 && num2 != num1)
            System.out.println(2);
        else if (num2 == num3 && num1 != num2)
            System.out.println(1);
    }
}