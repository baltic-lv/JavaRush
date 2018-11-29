package com.javarush.task.task0520;

/*Изучи класс Circle. Напиши максимальное количество конструкторов
с разными аргументами.*/
public class Circle {
    public double x = 6;
    public double y = 2;
    public double radius = 4;

    //напишите тут ваш код
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this.x = x;
        this.y = y;
        this.radius = radius;


    }

    public Circle(double y) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }


    public static void main(String[] args) {

    }
}