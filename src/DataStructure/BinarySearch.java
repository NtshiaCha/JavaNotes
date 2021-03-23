package DataStructure;

public class BinarySearch {

    public static void main(String[] args) {
        int [] myArray = {1,5,8,96,48,325,645,858,121};
        int key = 121;
        int last = myArray.length - 1;

        int result = myBinarySearch(myArray, 0, last, key);

        if (result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found on index " + result);
        }
    }

    public static int myBinarySearch(int[] myArray, int first, int last, int key){
        if(last >= first){
            int mid = first + (last - first)/2;

            if(myArray[mid] == key){
                return mid;
            }

            if(myArray[mid] > key){
                return myBinarySearch(myArray, first, mid - 1, key);
            } else {
                return myBinarySearch(myArray, mid + 1, last, key);
            }
        }
        return -1;
    }
}
