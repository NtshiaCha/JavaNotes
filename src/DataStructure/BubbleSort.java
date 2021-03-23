package DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] myArray = {1,2,5,6,9,87,2};

        sortEx(myArray);

        System.out.println(Arrays.toString(sortEx(myArray)));

    }

    public static int[] sortEx(int[] mySortArray){
        int temp;

        for(int i = 0; i < mySortArray.length; i ++){
            for(int j = 0; j < mySortArray.length - 1; j++){
                if(mySortArray[j] < mySortArray[j + 1]){
                    temp = mySortArray[j];
                    mySortArray[j] = mySortArray[j + 1];
                    mySortArray[j + 1] = temp;
                }
            }
        }
        return mySortArray;
    }
}
