package com.javarush.task.task02.task0130;

/*Метод convertCelsiumToFahrenheit(int celsium) принимает значение в
градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF - 32) * 5/9* TF-32 = TC/(5/9) TF = TC/(5/9)+32*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        double tf = celsium * (double)9/5 + 32; // 9/5 must to make as double
        return tf;
    }

}
