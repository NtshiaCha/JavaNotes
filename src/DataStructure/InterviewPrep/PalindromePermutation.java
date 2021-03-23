package DataStructure.InterviewPrep;

//public class PalindromePermutation {
////    /* Given a String, Write a function to check if it is a permutation of a palindrome.
////    *
////    * A palindrome is a word or phrase that is the same forwards and backwards.
////    *
////    * A permutation is a rearrangement of letters.  */
////
//////    public static void main(String[] args) {
//////
//////    }
//////
//////
//////    public Boolean isPermuntationPalindrome(String perpalList){
//////        //initialize index to the first element
//////        int countOdd = 0;
//////        //initialize a int array and instantiate a new int array to get a numeric or character value.
//////        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
//////
//////        // enhance for loop to iterate each element
//////        for(char c : perpalList.toCharArray()){
//////            int x = getCharNumber(c);
//////            if (x != -1) {
//////                table[x]++;
//////
//////                if(table[x] % 2 == 1){
//////                    countOdd++;
//////                } else {
//////                    countOdd --;
//////                }
//////            }
//////        }
//////        return countOdd <= 1;
//////    }
//////}
