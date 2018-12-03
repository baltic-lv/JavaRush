package com.javarush.task.task07.task0702;
/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }

        for (int j = array.length-1; j+1 > 0; j--) {
            System.out.println(array[j]);
        }
    }
}
