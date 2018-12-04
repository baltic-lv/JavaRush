package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhereIsMore {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int odd = 0;
        int even = 0;
        int[] street = new int[15];
        for (int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                even += street[i];
            else
                odd += street[i];
        }

        if (odd > even)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
