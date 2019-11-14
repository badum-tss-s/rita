package company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinSearch {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int array[] = new int[20];

        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt()%1000;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int search = in.nextInt();

        boolean m = true;

        int start = 0;
        int end = array.length - 1;
        int i = 0;

        while (m) {

            int mid = (start + end) / 2;
            if (array[mid] == search) {
                System.out.println(mid);
                m = false;
            } else {
                if (array[mid] < search) {
                    start = mid + 1;
                } else {
                    if (array[mid] > search) {
                        end = mid - 1;
                    }
                }
            }

        }
        System.out.println("Iteration: " + i);
        i++;

    }
}

