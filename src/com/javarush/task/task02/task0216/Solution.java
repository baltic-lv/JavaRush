package com.javarush.task.task02.task0216;

public class Solution {
    public static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c)
                return a;
            else
                return c;
        }
        if (b<c)
            return b;
        else
            return c;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}


