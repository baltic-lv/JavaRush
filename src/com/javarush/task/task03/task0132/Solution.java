package com.javarush.task.task03.task0132;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}