package DataStructure;

public class LinearSearch {

    public static void main(String[] args) {
        int[] mySearchArray = {1,5,8,4,9,3,48,68,49};

        int myKey = 48;

        System.out.println(myKey + " was found on index " + myLinearSearch(mySearchArray, myKey));
    }


    public static int myLinearSearch(int[] myArray, int key){

        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == key){
                return i;
            }
        }
        return -1;
    }
}

