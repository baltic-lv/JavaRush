package com.javarush.task.task07.task0728;
/*Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив <u>по убыванию.</u>*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortbyInsert {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        for (int i = 1; i < array.length; i++) {
            for (int j = i; (j > 0 && array[j - 1] < array[j]); j--) { // going back with swap(array[j-1]<->array[j])
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }

        }
    }
}


