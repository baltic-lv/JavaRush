package com.javarush.task.task07.task0724;

/*Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•	Выведи созданные объекты на экран.

  
 */
public class Family {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandF1 = new Human("Juris", true, 60);
        Human grandF2 = new Human("Jānis", true, 68);
        Human grandM1 = new Human("Dzintra", false, 59);
        Human grandM2 = new Human("Baiba", false, 70);

        Human father = new Human("Eduards", true, 50, grandF2, grandM2);
        Human mother = new Human("Dace", false, 40, grandF1, grandM1);

        Human daughter1 = new Human("Lote", false, 16, father, mother);
        Human daughter2 = new Human("Rozalinda", false, 15, father, mother);
        Human son = new Human("Zigis", true, 8, father, mother);

        System.out.println(grandF1);
        System.out.println(grandF2);
        System.out.println(grandM1);
        System.out.println(grandM2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter1);
        System.out.println(daughter2);
        System.out.println(son);
    }


    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
