package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/*Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».*/
public class SetClass {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> newset = new HashSet<>();
        newset.add("Ленинград");
        newset.add("Линда");
        newset.add("Логово");
        newset.add("Лаванда");
        newset.add("Лава");
        newset.add("Легенда");
        newset.add("Лапа");
        newset.add("Луг");
        newset.add("Лада-Калина");
        newset.add("Лагос");
        newset.add("Лекалы");
        newset.add("Липа");
        newset.add("Лупа");
        newset.add("Лувр");
        newset.add("Лондон");
        newset.add("Ласка");
        newset.add("Луна");
        newset.add("Литий");
        newset.add("Латы");
        newset.add("Лара");

        return newset;
    }

    public static void main(String[] args) {

    }
}

