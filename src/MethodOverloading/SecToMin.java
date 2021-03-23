package MethodOverloading;

public class SecToMin {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        System.out.println(getDurationString(66,44));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString (long minutes, long seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 59)){
             return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes/ 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
            if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minString = hours + "m";
            if(hours < 10) {
            minString = "0" + minString;
        }
        String secondsString = hours + "s";
            if(hours < 10) {
                secondsString = "0" + secondsString;
            }
        return hoursString + " " +  minString + " " + secondsString;
    }

    private static String getDurationString ( long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }

}
