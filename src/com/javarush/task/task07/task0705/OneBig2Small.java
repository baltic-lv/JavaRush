package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneBig2Small {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        for (int i = 0; i < 20; i++) {
            arrayBig[i] = Integer.parseInt(reader.readLine());
            if (i <= 9)
                small1[i] = arrayBig[i];
            else small2[i - 10] = arrayBig[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(small2[i]);
        }
    }
}

