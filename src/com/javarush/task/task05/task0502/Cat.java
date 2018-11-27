package com.javarush.task.task05.task0502;

/*Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е.
 возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false

Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength.
Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса,
возраста и силы.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/
public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if ((Cat.this.strength * Cat.this.weight - Cat.this.age) -
                (Cat.this.strength * Cat.this.weight - Cat.this.age) > 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.weight = 15;
        cat1.strength = 6;
        Cat cat2 = new Cat();
        cat2.strength = 4;
        cat2.weight = 17;
        cat2.age = 9;

        System.out.println(cat1.fight(cat2));
    }
}

