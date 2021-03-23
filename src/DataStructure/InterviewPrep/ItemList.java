package DataStructure.InterviewPrep;

import java.util.ArrayList;

public class ItemList {


    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);

    }

    public void printList(){
        System.out.println(groceryList.size());
        for(int i =0; i < groceryList.size(); i++){
            System.out.println((i+1) + " " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem, String newItem){
        int position = findGroceryItem(currentItem);
        if(position>=0){
            modifyGroceryList(position, newItem);
        }

    }
    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("List Item "+ (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findGroceryItem(item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);

    }

    public boolean onFile(String searchItem){
        int position = findGroceryItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
    private int findGroceryItem(String searchItem){
        //boolean exist = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);

    }
}
