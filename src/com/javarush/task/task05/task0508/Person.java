package com.javarush.task.task05.task0508;

/*Создать class Person. У человека должно быть
 имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.*/
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String name;
    public int age;
    public char sex;


    public static void main(String[] args) {

    }
}