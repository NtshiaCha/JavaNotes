package ControlFlow;

public class SwitchState {
    public static void main(String[] args) {
        int switchVal = 1;

        switch (switchVal){
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            default:
                System.out.println("was not 1 or 2");
        }
    }
}
