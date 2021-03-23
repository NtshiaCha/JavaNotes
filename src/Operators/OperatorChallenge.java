package Operators;

public class OperatorChallenge {

    public static void main(String[] args) {

        double oneVal = 20.00d;
        double secVal = 80.00d;

        double result = oneVal + secVal;
        result *= 100.00d;

        result %= 40.00d;

        boolean isResult = true;
        if(result == 0){
            System.out.println(isResult);
        }else {
            System.out.println("Got some remainder");
        }
    }
}
