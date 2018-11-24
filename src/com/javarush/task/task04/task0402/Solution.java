package com.javarush.task.task04.task0402;

/*Подсчитать суммарную стоимость яблок.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.

Требования:
•	Программа должна выводить текст на экран.
•	Метод addPrice класса Apple не должен выводить текст на экран.
•	Переменная applesPrice класса Apple должна быть статической, иметь тип int и проинициализирована нулем.
•	Метод main должен вызывать метод addPrice только два раза.
•	Метод addPrice класса Apple должен увеличивать стоимость яблок на переданное значение.*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        private static int applesPrice = 0;

        private static void addPrice(int applesPrice) {
            //напишите тут ваш код
            Apple.applesPrice += applesPrice;


        }
    }
}
