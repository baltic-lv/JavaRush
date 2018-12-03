package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке,
каждое значение выводить с новой строки.*/
public class ReverseArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));
        int[] array10 = new int[10];
        for (int i = 0; i < 10; i++) {
            array10[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = array10.length - 1; i >= 0; i--) {
            System.out.println(array10[i]);
        }
    }
}
