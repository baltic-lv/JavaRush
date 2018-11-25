package com.javarush.task.task04.task0433;

public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0;
        String dollar = "";
        while (i < 10) {
            while (j < 10) {
                dollar += "$";
                j++;
            }

            System.out.print(dollar + "\n");
            i++;
        }

    }
}
