package com.javarush.task.task03.task0308;

/*Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int res = 1;
        for (int i = 1; i < 11; i++)
            res *= i;
        System.out.println(res);

    }
}