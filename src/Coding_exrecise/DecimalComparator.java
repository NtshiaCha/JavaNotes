package Coding_exrecise;

public class DecimalComparator {

    /*
    create a method named areEqualByThreeDecimalPlaces with two parameters of type double
    return boolean && return true
    if two double numbers are the same up to three decimal places
    else return false
     */

    public static boolean areEqualByThreeDecimalPlaces(double x, double y){

        double valX = x * 1000;
        double valY = y * 1000;

        // simplified version
        // return (int) valX == (int) valY;

        if( (int)valX == (int)valY){
            return true;
        }
        return false;
    }
}
