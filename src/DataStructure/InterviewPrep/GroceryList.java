package DataStructure.InterviewPrep;


import java.util.Scanner;

public class GroceryList {

    private static Scanner input = new Scanner(System.in);
    private static ItemList groceryList = new ItemList();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit){
            System.out.println("Enter your choices ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                case 4:
                    removeItem();
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstruction(){
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of grocery Items");
        System.out.println("\t 2 - to add an item");
        System.out.println("\t 3 - to change an item");
        System.out.println("\t 4 - to remove an item");
        System.out.println("\t 5 - to search an item");
        System.out.println("\t 6 - Exit the application");
    }

    public static void addItem(){
        System.out.print(" enter the item");
        groceryList.addGroceryItem(input.nextLine());
    }

    public static void modifyItem(){
        System.out.println("enter item number to change: ");
        String itemNum = input.nextLine();
        input.nextLine();
        System.out.println("enter the replacement item: ");
        String newItem = input.nextLine();
        groceryList.modifyGroceryList(itemNum, newItem);

    }

    public static void removeItem(){
        System.out.println("enter item number to remove: ");
        String itemNum = input.nextLine();
        input.nextLine();
        groceryList.removeGroceryItem(itemNum);
    }

    public static void searchItem(){
        System.out.println("enter item search for ");
        String searchForItem = input.nextLine();
        if(groceryList.onFile(searchForItem)){
            System.out.println("Found " + searchForItem);
        }
    }
}
