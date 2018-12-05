package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Small {


    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> minList = new ArrayList<>();

        String K = reader.readLine();
        int tempMin = K.length();
        list.add(K);
        minList.add(K);
        //int lenK = K.length();

        for (int i = 0; i < 4; i++) {
            K = reader.readLine();
            list.add(K);
            int lenK = K.length();


            if (lenK == tempMin) {
                minList.add(K);
                tempMin = lenK;
            } else if (lenK < tempMin) {
                minList.clear();
                minList.add(K);
                tempMin = lenK;
            }
        }
        for (int i = 0; i < minList.size(); i++) {
            System.out.println(minList.get(i));
        }
    }
}