package com.javarush.task.task04.task0417;
/*Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
Программа должна считывать числа c клавиатуры.
Программа должна содержать System.out.println() или System.out.print()
Если два числа равны между собой, необходимо вывести числа на экран.
Если все три числа равны между собой, необходимо вывести все три.
Если нет равных чисел, ничего не выводить.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int anew = Integer.parseInt(a);

        String b = reader.readLine();
        int bnew = Integer.parseInt(b);

        String c = reader.readLine();
        int cnew = Integer.parseInt(c);

        if (anew == bnew && anew == cnew)
            System.out.println(anew + " " + bnew + " " + cnew);
        else if (anew == bnew)
            System.out.println(a + " " + a);
        else if (anew == cnew)
            System.out.println(a + " " + a);
        else if (bnew == cnew)
            System.out.println(b + " " + b);

    }
}
