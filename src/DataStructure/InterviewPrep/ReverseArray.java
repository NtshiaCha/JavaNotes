package DataStructure.InterviewPrep;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {
        int[] testArray = {59,58,77,21,88};

        System.out.println(Arrays.toString(testArray));

        reversedArray(testArray);

        System.out.println(Arrays.toString(testArray));

    }

    public static void reversedArray(int[] reverseList){
        int maxIndex = reverseList.length - 1;
        int halfIndex = reverseList.length/2;

        for (int i =0; i < halfIndex; i++){
            int temp;

            temp = reverseList[i];
            reverseList[i] = reverseList[maxIndex - i];
            reverseList[maxIndex - i] = temp;

        }
    }
}
