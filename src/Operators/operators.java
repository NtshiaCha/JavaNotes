package Operators;

public class operators {

    public static void main(String[] args) {

        // + operator
        int result = 1 + 2; // 1 + 2 = 3

        System.out.println( "1 + 2 = " + result );

        int previousResult = result;

        System.out.println(previousResult);

        // - operator
        result = result - 1; // 3 - 1 = 2

        System.out.println("The result is " + result);

        // * operator
        result = result * 10; // 2 * 10 = 20

        System.out.println( result);

        // / operator
        result = result / 5; //20 / 5 = 4

        System.out.println(result);

        // % operator
        result = result % 3; // the remainder of 4 % 3 = 1

        System.out.println( result );

        //shortcut math

        // result = result + 1
        result++;

        System.out.println("1 + 1 = " + result);

        //result = result - 1
        result--; // 2 - 1 = 1

        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3

        System.out.println(result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30

        System.out.println(result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10

        System.out.println(result);
    }
}
