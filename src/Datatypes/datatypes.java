package Datatypes;

public class datatypes {

    public static void main(String[] args) {

        int myValue = 100;

        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;


        System.out.println("Minimum integer " + myMin);
        System.out.println("Maximum integer " + myMax);

        //Byte

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("Minimum byte " + myMinByte);
        System.out.println("Maximum byte " + myMaxByte);

        //short
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("Minimum short " + myMinShort);
        System.out.println("Maximum short " + myMaxShort);

        //long
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println("Minimum long " + myMinLong);
        System.out.println("Maximum long " + myMaxLong);

        //Float
        //Float is a single

        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;

        System.out.println("Minimum float " + myFloatMin);
        System.out.println("Maximum float " + myFloatMax);

        //Double
        //Double is a double
        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;

        System.out.println("Minimum double " + myDoubleMin);
        System.out.println("Maximum double " + myDoubleMax);

        int myIntValue = 4;
        float myFloatVal = (float) 5.25; //Fixed by casting float to the valu
        double myDoubleVal = 5.25d;


        //Char

        char myChar = 'D';
        char myUnicode = '\u0044';
        char myUnicodeCopyR = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myUnicodeCopyR);

        //Boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isOverAge = true;

    }
}
