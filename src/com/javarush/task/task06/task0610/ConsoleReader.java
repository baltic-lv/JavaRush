package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и
возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или
 Scanner) внутри каждого метода.*/


public class ConsoleReader {
    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));


    public static String readString() throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        return str;
    }

    public static int readInt() throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int numInt = Integer.parseInt(reader.readLine());
        return numInt;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        double numDouble = Double.parseDouble(reader.readLine());
        return numDouble;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        boolean bool = Boolean.parseBoolean(reader.readLine());
        return bool;
    }

    public static void main(String[] args) {

    }
}