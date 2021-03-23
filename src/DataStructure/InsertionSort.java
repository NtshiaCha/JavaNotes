package DataStructure;

public class InsertionSort {


    public static void main(String[] args) {
        int[] testArray = {1, 48, 36, 158, 56, 89, 92};

        for(int i : testArray){
            System.out.println(i + " ");
        }

        myInsertSort(testArray);


        for(int j : testArray){
            System.out.println(j + " ");
        }


    }



    public static void myInsertSort(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            int key = myArray[i];

            int j = i - 1;

            while ((j > -1 ) && (myArray[j] > key)){
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j+1] = key;
        }

    }
}
