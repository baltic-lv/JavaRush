package com.javarush.task.task03.task0303;
/*Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(10,1.1));
        System.out.println(convertEurToUsd(35,1.15));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;
    }
}