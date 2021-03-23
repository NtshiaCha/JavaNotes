package Coding_exrecise;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int commonDivisor = 0;

        for (int divider = 1; (divider <= first) || (divider <= second) ; divider++) {

            if (((first % divider) == 0) && ((second % divider)==0)) {

                if (divider > commonDivisor) {
                    commonDivisor = 0;
                    commonDivisor += divider;
                }
            }

        }
        return commonDivisor;
    }
}

