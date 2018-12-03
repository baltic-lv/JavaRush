package com.javarush.task.task06;
/*5 numbers sorting, no arrays, no algorithms, simply 7 variables*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sort5num {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int max, min, n2;

        min = Integer.parseInt(reader.readLine());
        n2 = Integer.parseInt(reader.readLine());
        if (n2 < min) {
            max = min;
            min = n2;
        } else max = n2;


        int n3 = Integer.parseInt(reader.readLine());

        if (n3 > max) {
            n2 = max;
            max = n3;
        } else if (n3 < min) {
            n2 = min;
            min = n3;
        } else n2 = n3;


        int n4 = Integer.parseInt(reader.readLine());

        if (n4 > max) {
            n3 = max;
            max = n4;
        } else if (n4 < min) {
            n3 = n2;
            n2 = min;
            min = n4;
        } else if (n4 < n2) {
            n3 = n2;
            n2 = n4;
        } else n3 = n4;

        int n5 = Integer.parseInt(reader.readLine());
        if (n5 > max) {
            n4 = max;
            max = n5;
        } else if (n5 < min) {
            n4 = n3;
            n3 = n2;
            n2 = min;
            min = n5;
        } else if (n5 < n2) {
            n4 = n3;
            n3 = n2;
            n2 = n5;
        } else if (n5 < n3) {
            n4 = n3;
            n3 = n5;
        } else n4 = n5;


        // System.out.println(min+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+max);
        System.out.println(min + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + max);
    }
}