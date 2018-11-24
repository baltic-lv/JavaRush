package com.javarush.task.task04.task0407;

/*Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.

Требования:
•	Программа должна выводить текст на экран.
•	Нельзя изменять строку отвечающую за вывод в консоль.
•	Класс Cat должен содержать только одну переменную count.
•	Переменная count класса Cat должна быть статической, иметь модификатор доступа public, тип int и проинициализирована нулем.
•	В методе main должно быть только две проинициализированные переменные типа Cat.
•	Переменная count должна содержать актуальное количество созданных объектов-котов.*/
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
