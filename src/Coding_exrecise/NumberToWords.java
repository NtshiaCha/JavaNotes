package Coding_exrecise;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(274);
    }

    public static int getDigitCount (int number){
        //Validate Number
        if(number < 0){
            return -1;
        }
        //Initialize Counter
        int count = 0;
        //loop through places adding to count
        while (number > 0){
            count += 1;
            number = number/10;
        }
        return count > 0 ? count : 1;
    }

    public static int reverse (int number){
        //initialize placeholder
        int reverse = 0;

        //loop through appending number to reverse
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static void numberToWords (int number){

        //Initialize Variable
        int places = getDigitCount(number);

        //Validates number value
        if (number < 0)
            System.out.println("Invalid Value");

        int reversedNumber = reverse(number);

        while (places > 0){
            places --;

            int current = reversedNumber % 10;

            switch (current){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:

            }
            reversedNumber = reversedNumber / 10;
        }

    }
}
