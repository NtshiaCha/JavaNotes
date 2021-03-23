package ControlFlow;

public class ForLoop {
/*
    for(init; termination; increment) {

    }

     for(int i = 0; i < 5; i ++){

     }


    public static void main(String[] args) {
        for (int i = 2; i < 9; i++){
            System.out.println( String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

 */

    public static void main(String[] args) {
        for (int i = 8; i >= 2; i--){
            System.out.println( String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
