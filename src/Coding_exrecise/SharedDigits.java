package Coding_exrecise;

public class SharedDigits {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23,42));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int temp = num2;
        while (num1 != 0){
            int lastNum = num1 % 10;
            num1 /= 10;
            while (num2 !=0) {
                int lastNum2 = num2 % 10;
                num2 /= 10;
                if (lastNum == lastNum2) {
                    return true;
                }
            }
            num2 = temp;
        }
        return false;
        }
}
