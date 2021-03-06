package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр,
а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b -
 количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1*/
public class OddEven {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String numS = reader.readLine();
        int lenNum = numS.length();
        int num = Integer.parseInt(numS);
        even = 0;
        odd = 0;
        for (int i = 0; i < lenNum; i++) {
            if (num % 10 % 2 == 0) {
                even++;
            } else
                odd++;
            num /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}