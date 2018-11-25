package com.javarush.task.task05.task0507;
/*Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее
арифметическое всех чисел и завершить программу.
-1 не должно учитываться.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Avarage {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        float sum = 0;
        float number;
        while (true) {
            number = Float.parseFloat(reader.readLine());
            if (number == -1) {
                break;
            } else {
                i++;
                sum += number;
            }
        }
        float avg = sum / i;
        System.out.println(avg);
    }
}

