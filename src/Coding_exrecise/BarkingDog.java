package Coding_exrecise;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean bark, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
    }else return bark && hourOfDay < 8 || hourOfDay > 22;

}
}

