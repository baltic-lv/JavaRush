package com.javarush.task.task06.task0611;


/*Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго*/
public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            buffer.append(s);
        }
        result = buffer.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++)
            buffer.append(s);
        result = buffer.toString();
        return result;
    }

    public static void main(String[] args) {
    }
}


