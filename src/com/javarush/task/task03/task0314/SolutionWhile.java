package com.javarush.task.task03.task0314;
/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...
While loop
*/
public class SolutionWhile {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        while (i<11) {
            while (j < 11) {
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            i++; j=1;

        }
    }
}
