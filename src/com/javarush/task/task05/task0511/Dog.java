package com.javarush.task.task05.task0511;

public class Dog {
    public String name = null;
    public int height = 50;
    public String color = "no-color";

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
