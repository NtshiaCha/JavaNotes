package DataStructure;

import java.util.Scanner;

public class Array {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInt = getInt(5);
        System.out.println(getAverage(myInt));

    }

    public static int[] getInt(int num){
        System.out.println(num);
        int[] value = new int[num];

        for(int i =0; i < value.length; i++){
            value[i] = input.nextInt();

        }
        return value;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}