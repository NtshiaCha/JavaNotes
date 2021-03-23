package Coding_exrecise;

public class LeapYear {
    /*
    Create a method isLeapYear
    create a parameter int year
    Parameter >= 1 && <= 9999

    create a if else statement to return
    true if in valid range
    false if not valid

     */

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else {
            switch (month) {

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        return 29;
                    }else {
                        return 28;
                    }

                case 4: case 6: case 9: case 11:
                    return 30;

                default:
                    return -1;
            }
        }
    }
}
