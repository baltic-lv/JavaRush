package com.javarush.task.task08.task0802;

import java.util.HashMap;
//import java.util.Map;

/*Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
•	Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
•	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.

  
*/
public class HerbalHasMap {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> herbal = new HashMap<>();

        herbal.put("арбуз", "ягода");
        herbal.put("банан", "трава");
        herbal.put("вишня", "ягода");
        herbal.put("груша", "фрукт");
        herbal.put("дыня", "овощ");
        herbal.put("ежевика", "куст");
        herbal.put("жень-шень", "корень");
        herbal.put("земляника", "ягода");
        herbal.put("ирис", "цветок");
        herbal.put("картофель", "клубень");

        for (HashMap.Entry entry : herbal.entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + entry.getValue());
        }
    }
}

