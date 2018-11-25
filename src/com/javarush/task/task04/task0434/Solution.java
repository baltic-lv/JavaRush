package com.javarush.task.task04.task0434;

/*Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.*/
public class Solution {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i < 11) {
            while (j < 11) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            j = 1;
            System.out.print("\n");
        }

    }
}

