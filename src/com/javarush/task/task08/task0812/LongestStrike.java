package com.javarush.task.task08.task0812;
/*. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

  
Входные данные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongestStrike {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int k = Integer.parseInt(reader.readLine());
        int Max = 1;
        int strikeTemp = 1;
        int temp = k;
        list.add(0, k);
        for (int i = 1; i < 10; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
            if (list.get(i) == temp) {
                strikeTemp += 1;
                if (strikeTemp > Max)
                    Max = strikeTemp;

            } else {
                temp = list.get(i);
                strikeTemp = 1;
            }


        }
        System.out.println(Max);
    }
}
