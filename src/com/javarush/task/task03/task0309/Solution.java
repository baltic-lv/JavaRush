package com.javarush.task.task03.task0309;

/*Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...

Пример вывода:
1
3
6
...
*/
public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
