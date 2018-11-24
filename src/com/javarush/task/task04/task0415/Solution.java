package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше или равна сумме двух других,
 то треугольника с такими сторонами не существует.

Требования:
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine();
        String bS = reader.readLine();
        String cS = reader.readLine();
        int a = Integer.parseInt(aS);
        int b = Integer.parseInt(bS);
        int c = Integer.parseInt(cS);

        if ((a + b) > c && (a + c) > b && (b + c) > a)

            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}
