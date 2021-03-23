package Coding_exrecise;

import ControlFlow.WhileLoop;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
            int aV = a % 10;
            int bV = b % 10;
            int cV = c % 10;

        return aV == bV || bV == cV || aV == cV;
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
}
