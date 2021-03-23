package Coding_exrecise;

public class Megabytes {
    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int kilo = kiloBytes % 1024;
            int megaBytes = kiloBytes/1024;
            System.out.println( kiloBytes + " = " + megaBytes + " KB " + " and " + kilo +" KB");
        }
    }
}
