package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numS = reader.readLine();
        int num = Integer.parseInt(numS);
        int length = numS.length();


        String lenNumber = "";
        switch (length) {
            case 1:
                lenNumber = "однозначное";
                break;
            case 2:
                lenNumber = "двузначное";
                break;
            case 3:
                lenNumber = "трехзначное";
                break;
        }

        if ((num > 0) && (num < 1000) && (num % 2 == 0))
            System.out.println("четное " + lenNumber + " число");

        else if ((num > 0) && (num < 1000) && (num % 2 == 1))
            System.out.println("нечетное " + lenNumber + " число");
    }


}


