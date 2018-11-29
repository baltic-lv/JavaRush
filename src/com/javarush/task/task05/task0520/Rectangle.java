package com.javarush.task.task05.task0520;

public class Rectangle {
    public int top;
    public int left;
    public int height;
    public int width;


    public Rectangle(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.height = width;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.left = rectangle.left;
    }

    public static void main(String[] args) {
    }

}
