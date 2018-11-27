package com.javarush.task.task05.task0513;

/*Создать класс прямоугольник (Rectangle). Его данными будут top, left,
width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)*/
public class Rectangle {
    public int top;
    public int left;
    public int height;
    public int width;


    public void initialize(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }
    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.height = width;
        this.width = width;
    }

    public void initialize(Rectangle rectangle) {
        this.left = rectangle.left;
    }
    public static void main(String[] args) {
    }

}
