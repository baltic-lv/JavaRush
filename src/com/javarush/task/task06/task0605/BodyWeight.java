package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Программа должна считывать введенные пользователем вес в килограммах и рост в
 метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы
тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
"Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
"Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9*/
public class BodyWeight {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter yours weight, please: ");
        double weight = Double.parseDouble(reader.readLine());
        System.out.println("Enter youts height, please: ");
        double height = Double.parseDouble(reader.readLine());
        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index = weight / (height * height);



            if (index < 18.5)
                System.out.println("Недовес: меньше чем 18.5");
            else if (index < 24.9 && index >= 18.5)
                System.out.println("Нормальный: между 18.5 и 24.9");
            else if (index < 29.9 && index >= 25)
                System.out.println("Избыточный вес: между 25 и 29.9");
            else
                System.out.println("Ожирение: 30 или больше");


        }

    }
}
