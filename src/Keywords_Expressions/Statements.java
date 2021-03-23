package Keywords_Expressions;

public class Statements {
    public static void main(String[] args) {
        int myVariable = 50; //valid statement
        myVariable++;
        myVariable--;

        System.out.println("this is a test");

        System.out.println("This is" +
                "another" +
                "statement.");
        int anotherVariable = 50; myVariable--;
        System.out.println("Also valid");
    }
}
