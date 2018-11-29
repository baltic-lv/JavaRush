package com.javarush.task.task05.task0517;

/*Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)*/
public class Cat {
    private String name = null;
    private int weight = 10;
    private int age = 6;
    private String color = "no-color";
    private String address = null;

    //имя
    public Cat(String name) {
        this.name = name;
    }

    //- Имя, вес, возраст
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    //- Имя, возраст (вес стандартный)
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.address = null;
        this.age = age;

    }

    //- вес, цвет, адрес (чужой домашний кот)*/
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
