package Coding_exrecise;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println( isPalindrome( 11));
    }

    public static boolean isPalindrome(int number){

        // initialized the parameters
        int reverse = 0;
        int number2 = Math.abs(number);
        int lastDigit;

        // use while loop to cycle and check
        while (number2 != 0 ) {
            lastDigit = number2 % 10;
            reverse = (reverse * 10) + lastDigit;
            number2 = number2 / 10;
        }
        if (number < 0){
            reverse = reverse * -1;

        }
        return reverse == number;
    }
}
