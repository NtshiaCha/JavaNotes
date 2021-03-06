package Coding_exrecise;

public class CodingEx1 {

    public static void main(String[] args) {

        long miles = toMilePerHour(10.5);
        System.out.println(miles);

        printConversion(10.5);
    }

    public static long toMilePerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilePerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
