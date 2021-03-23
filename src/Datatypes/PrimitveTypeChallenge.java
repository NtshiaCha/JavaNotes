package Datatypes;

public class PrimitveTypeChallenge {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000L + 10L * ( byteValue + shortValue + intValue);

        System.out.println(longTotal);

        //Challenge converting pounds to kilograms

        double myPoundVal =  200d;
        double convertKilo = myPoundVal * 0.45359237d;

        System.out.println("Converted Pounds to Kilo is " + convertKilo);

    }
}
