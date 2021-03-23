package Coding_exrecise;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));

    }

    public static int sumDigits(int number){
        if (number < 10 ) {
            return -1;
        }

        int sum = 0;
        // 125  -> 125 / 10 = 12 *10 = 120 -> 125 - 120 = 5

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;

        }
        return sum;
    }
}
