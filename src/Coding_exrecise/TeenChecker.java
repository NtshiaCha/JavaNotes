package Coding_exrecise;

public class TeenChecker {

    /*
    create method called hasTeen with 3 parameters
    teen range is 13 - 19
    return boolean value
    true if age is between teen range
     */

    public static boolean hasTeen(int aV, int bV, int cV){
        return aV >= 13 && aV <= 19 || bV >= 13 && bV <= 19 || cV >= 13 && cV <= 19;
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
