package company;

import java.util.Arrays;

public class Functions {


    // написать функию которая принимает два аргумента а возвращает суму;
    public static int myInt(int a, int b) {
        return a + b;
    }

    // написать фунцию которая принимает три аргумента а возвращает максимальное среди 	трех;
    public static int max(int a, int b, int c) {
        int m = 0;
        if (a > b && a > c) m = a;
        if (b > c && b > a) m = b;
        if (c > b && c > a) m = c;

        return m;
    }

    // функция которая инициализирует массив на 25 элементов(массив должен быть 	глобальной переменной);
    public static int[] Arr(int a) {
        int[] myArray;
        myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = i;

        }
        return myArray;
    }


    // функию которая выводит на екран элементы ранее созданого массива;

    public static int[] elem(int a) {
        int[] b = new int[0];
        for (int i = 0; i <= Arr(a).length; i++) {
            b = Arr(i);

        }
        return b;
    }

    public static void main(String[] args) {
        // System.out.println();
        //  System.out.println("the biggest is: " +max(4, 8, 1));
        System.out.println(Arrays.toString (elem( 25)));
        //System.out.println(myInt(2, 9));

    }
}
