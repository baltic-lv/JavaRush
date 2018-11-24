package com.javarush.task.task04.task0404;

/*Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.

Требования:
•	Класс Cat должен содержать только одну переменную catsCount.
•	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
•	Класс Cat должен содержать два метода addNewCat и main.
•	Метод addNewCat класса Cat должен увеличивать количество котов на 1.*/
public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        Cat.catsCount += 1; // Cat.catsCount - access to class variable catsCount

    }

    public static void main(String[] args) {

    }
}
