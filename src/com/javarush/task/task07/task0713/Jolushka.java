package com.javarush.task.task07.task0713;
/*1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Jolushka {


    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> full = new ArrayList<Integer>();
        ArrayList<Integer> divide3 = new ArrayList<Integer>();
        ArrayList<Integer> divide2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
// 26  25 29 71 81 29 24 36 78 46 79 14 28 150 29 18 23 14 12  192

        for (int i = 0; i < 20; i++) {
            full.add(Integer.parseInt(reader.readLine()));
        }
        int K;
        for (int i = 0; i < full.size(); i++) {
            K = full.get(i);

            if ((K % 3 == 0) && K % 2 != 0)
                divide3.add(K);


            else if (K % 2 == 0 && (K % 3 != 0))
                divide2.add(K);

            else if (K % 6 == 0) {
                divide3.add(K);
                divide2.add(K);
            } else
                other.add(K);
        }
        //System.out.println("divide3");
        printList(divide3);
        //System.out.println("divide2");
        printList(divide2);
        //System.out.println("other");
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }

    }
}


