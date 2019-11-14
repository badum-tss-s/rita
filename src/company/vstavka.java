package company;

import java.util.Random;

public class vstavka {

    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[10];
        int j;
        {
            for (int i = 0; i < array.length; i++){
                array[i] = random.nextInt()%1000;
            }
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }

            for(int i=0; i<array.length; i++) {
                int temp = array[i];
                for(j = i-1; j>=0 && array[j]>temp; j-- ){
                    array[j+1] = array[j];
                }
                array [j+1] = temp;


            }
            System.out.println();
            for (int i = 0; i<array.length; i++) System.out.print(array [i] + " ");

        }


    }
}