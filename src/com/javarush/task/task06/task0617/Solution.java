package com.javarush.task.task06.task0617;

/*1. В классе Solution создать public static класс Idea
2. В классе Idea создать метод public String getDescription(), который будет
 возвращать любой непустой текст
3. В классе Solution создай статический метод public void printIdea(Idea idea),
 который будет выводить на экран описание идеи - это то, что возвращает метод
 getDescription

Требования:
•	В классе Solution создать public static класс Idea.
•	В классе Idea создать метод public String getDescription().
•	Метод getDescription должен возвращать любой непустой текст.
•	В классе Solution создайте метод public static void printIdea(Idea idea).
•	Метод printIdea должен выводить описание идеи на экран.*/
public class Solution {
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {

        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static class Idea {
        public String getDescription() {
            String idea = "Any no-empty text ";
            return idea;
        }
    }

}
