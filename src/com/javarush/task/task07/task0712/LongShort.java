package com.javarush.task.task07.task0712;
/*1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongShort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String maxString = " ";
        int maxPlace = -1;
        int maxLen = -1;
        int len = 0;
        for (int i = 0; i < list.size(); i++) {
            len = list.get(i).length();
            if (len > maxLen) {
                maxLen = len;
                maxString = list.get(i);
                maxPlace = i;

            }
        }
        /*System.out.println(maxString);
        System.out.println(maxPlace);*/

        String minString = list.get(0);
        int minLen = list.get(0).length();
        int minPlace = 0;

        int lenM = -1;
        for (int i = 1; i < list.size(); i++) {
            lenM = list.get(i).length();
            if (lenM < minLen) {
                minString = list.get(i);
                minLen = lenM;
                minPlace = i;
            }

        }
        /*System.out.println(minString);
        System.out.println(minPlace);*/
        if (minPlace < maxPlace)
            System.out.println(minString);
        else System.out.println(maxString);
    }
}

