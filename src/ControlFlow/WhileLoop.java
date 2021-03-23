package ControlFlow;

public class WhileLoop {
    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 6){
//            System.out.println( count);
//            count++;
//        }
//
//        count = 1;
//
//        while (true){
//            if( count == 6){
//                System.out.println( count);
//                break;
//            }
//            System.out.println(count);
//            count++;
//        }
//
//
//        //do while will always execute at least once
//        count = 1;
//        do {
//            System.out.println(count);
//            count++;
//        }while (count !=6);

        int number = 4;
        int finishNumber = 20;

        while (number<= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println(number);
        }
    }


    private static boolean isEvenNumber(int isEven){
        if ((isEven%2 ==0)){
            return true;
        }
        return false;
    }


}
