package com.javarush.task.task04.task0441;
/*Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MiddleOf3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number, please, num1= ");
        int num1 = Integer.parseInt(reader.readLine());
        int max = num1;

        System.out.println("Enter 2nd number, please, num2= ");
        int num2 = Integer.parseInt(reader.readLine());

        int mid = -1;
        if (num1 >= num2)
            mid = num2;
        else {
            mid = num1;
            max = num2;
        }
        System.out.println("Enter 3rd number, please, num3= ");
        int num3 = Integer.parseInt(reader.readLine());
        if (num3 > mid && num3 <= max)
            mid = num3;
        else if (num3 > max)
            mid = max;

        System.out.println(mid);
    }
}








