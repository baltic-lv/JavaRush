package com.javarush.task.task05.task0505;
/*Создать три кота используя класс Cat.
        Провести три боя попарно между котами.
        Класс Cat создавать не надо. Для боя использовать метод boolean
        fight(Cat anotherCat).
        Результат каждого боя вывести на экран c новой строки.*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1=new Cat("Carla",11,8,15);
        Cat cat2=new Cat("Bosiks",6,14,20);
        Cat cat3=new Cat("Roma",4,17,26);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
