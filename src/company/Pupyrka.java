package company;

import java.util.Random;

public class Pupyrka {

    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int[10];
        int a, b, t;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 1000;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (a = 1; a < array.length; a++)
            for (b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {

                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

