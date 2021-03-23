package Coding_exrecise;

public class FirstAndLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int sum;
        int firstNum = number;
        int tempFirstNum = 0;
        int lastNum = (firstNum % 10); // last digit;

        while (firstNum != 0){
            tempFirstNum = firstNum % 10; // first Digit
            firstNum /=10;

        }
        sum = (tempFirstNum + lastNum);
        return sum;
    }
}
