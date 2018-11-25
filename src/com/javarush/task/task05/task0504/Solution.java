package com.javarush.task.task05.task0504;

/*Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
 а точнее - основываясь на нём, как на шаблоне.
Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Barsiks", 10, 10, 24);
        Cat cat2 = new Cat("Pika", 16, 12, 8);
        Cat cat3 = new Cat("Džoja", 2, 11, 20);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

}
