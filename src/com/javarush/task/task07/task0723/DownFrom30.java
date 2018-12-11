package com.javarush.task.task07.task0723;

/*Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.*/
public class DownFrom30 {

    public static void main(String[] args) throws Exception {

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                Thread.sleep(100);
            }
        }

        System.out.println("Бум!");

    }

}


