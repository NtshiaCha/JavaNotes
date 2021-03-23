package MethodOverloading;

public class CalculateScore {
    public static void main(String[] args) {
        int newScore = calculateScore("Ban", 700);
        System.out.println(newScore);
        calculateScore(422);
    }

    public static int calculateScore(String name, int score){
        System.out.println("Player "+ name + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + " points");
        return score * 1000;
    }
}
