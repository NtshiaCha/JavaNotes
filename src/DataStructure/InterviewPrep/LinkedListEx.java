package DataStructure.InterviewPrep;

import java.util.ArrayList;

public class LinkedListEx {

    public static void main(String[] args) {
        Customer customer = new Customer("Ntshia", 74.95);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Print balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
            intList.add(1,2);

            for (int i = 0; i < intList.size(); i++){
                System.out.println(i + ": " + intList.get(i));
            }
        }
}
