package Coding_exrecise;

public class MinYearsDays {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long days = minutes/(24* 60);
            long years = minutes * ( days/ 365);
            long remainingYears = days % 365;

            System.out.println(minutes + " min"+ " = " + years + " y"+ " and " + days +" d" );
        }

        }

    public static void printYearsAndDays(){

    }
    }

