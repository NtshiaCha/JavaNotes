package DataStructure;

import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);

        int[] sorted = sortArray(intArray);

        printArray(sorted);

    }

    public static int[] getIntegers(int myIntArray){

        int[] value = new int[myIntArray];

        for(int i =0; i < value.length; i++){
            value[i] = input.nextInt();
        }

        return value;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("This is the Array " + array[i]);
        }
    }

    public static int[] sortArray(int[] sortIt){
        int[] sortedValue = new int[sortIt.length];

        for(int i = 0; i < sortIt.length; i++ ){
            sortedValue[i] = sortIt[i];
    }
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i =0; i < sortedValue.length - 1; i++){
                if (sortedValue[i] < sortedValue[i + 1]) {
                    temp = sortedValue[i];
                    sortedValue[i] = sortedValue[i + 1];
                    sortedValue[i + 1] = temp;

                    flag = true;
                }
            }
        }

        return sortedValue;

    }



}
