package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Вводить с клавиатуры числа и считать их сумму, пока пользователь
не введет слово "stop".
Вывести на экран полученную сумму.
Подсказка: реализовать считывание с клавиатуры, пока не будет введена
определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}*/
public class Sum {

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String numS = reader.readLine();
            if (numS.equals("stop"))
                break;
            else {
                int num = Integer.parseInt(numS);
                sum += num;
            }

        }
        System.out.println(sum);
    }
}
