package ControlFlow;

public class PrimeNumber {

    public static void main(String[] args) {

        int count = 0;

        for (int j = 10; j < 50; j ++){
            if (isPrime(j)){
                count ++;
                System.out.println( j );
                if (count == 3 ){
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
