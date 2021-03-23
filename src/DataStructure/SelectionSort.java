package DataStructure;

public class SelectionSort {

    public static void main(String[] args) {
        int[] testArray = {2, 8, 9, 47, 499, -7, -3, 99};

        for (int i : testArray){
            System.out.print(i + " ");
        }

        System.out.println();

        selectionSort(testArray);

        for (int i : testArray){
            System.out.print(i + " ");
        }
    }


    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){

            int index = i;
            for (int j = i +1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j; //searching for the lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}
