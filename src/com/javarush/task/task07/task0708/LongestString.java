package com.javarush.task.task07.task0708;
/*1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько,
 выведи каждую с новой строки.*/
/*Я твой самый удачный эксперимент...
Ты имеешь меня как свой лучший патент
Да,Я горькая,но Я панацея тебе во спасенье
Я нужна тебе как есть-без изменения...
Ты ослабь мне запястья,просто дай мне вздохнуть...*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongestString {

    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> maxList = new ArrayList<>();
        int tempmax = -1;
        int lenK = -1;
        for (int i = 0; i < 5; i++) {
            String K = reader.readLine();
            strings.add(K);
            lenK = K.length();


            if (lenK == tempmax) {
                maxList.add(K);
                tempmax = lenK;
            } else if (lenK > tempmax) {
                maxList.clear();
                maxList.add(K);
                tempmax = lenK;
            }
        }
        for (int i = 0; i < maxList.size(); i++) {
            System.out.println(maxList.get(i));
        }
    }
}