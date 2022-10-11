/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05truthcalpito;

import java.util.ArrayList;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();
    
    public Store(String name){
        // Initialize name to parameter and earnings to zero, Initialize itemList as a new ArrayList, add 'this' store to storeList
        earnings = 0;
        this.name = name;
      
        this.itemList = new ArrayList();
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
  
    public double getEarnings(){
        return earnings;
    }

    public void sellItem(int index){
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store), get Item at index from itemList and add its cost to earnings, print statement indicating the sale
        if (index > itemList.size()) {
            System.out.printf("\nYou are trying to buy the item at slot %d. There are only %d items in the store.\n", index, itemList.size() );
        }
        
        else if (index < itemList.size()) {
            for(Item i : itemList){
                if(i.equals(itemList.get(index))) {
                    earnings += i.getCost();
                    System.out.printf("\nYou bought %s at %.2f.\n", i.getName(), i.getCost());
                }
            }
        }
    }
  
    public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it), get Item from itemList and add its cost to getEarnings, print statement indicating the sale
        boolean isPresent = false;        
    
        for(Item i : itemList){
            if(i.getName().equals(name)) {
                earnings += i.getCost();
                System.out.printf("\nYou bought %s at %.2f.\n", i.getName(), i.getCost());
                isPresent = true;
            }
        }
        
        if(!isPresent) {
            System.out.printf("\nThis store does not sell %s.\n", name);
        }
    }

    public void sellItem(Item i){
        // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it), get Item i from itemList and add its cost to getEarnings, print statement indicating the sale
        if (itemList.contains(i)) {
            earnings += i.getCost();
            System.out.printf("\nYou bought %s at %.2f.\n", i.getName(), i.getCost());
        }
        else {
            System.out.printf("\nThe store does not sell %s.\n", i.getName());
        }
    }
  
    public void addItem(Item i){
        // add Item i to store's itemList
        itemList.add(i);
    }
    
    public void filterType(String type){
        // loop over itemList and print all items with the specified type
        System.out.printf("\nThese are the %s items: ", type);
        for(Item i : itemList){
            if(i.getType().equals(type)) {
                System.out.printf("\n%s - %.2f", i.getName(), i.getCost());
            }
        }
        System.out.print("\n");
    }
    
    public void filterCheap(double maxCost){
        // loop over itemList and print all items with a cost lower than or equal to the specified value
        System.out.printf("\nThese are the items priced at less than or equal to %.2f: ", maxCost);
        for(Item i : itemList){
            if(i.getCost() <= maxCost) {
                System.out.printf("\n%s - %.2f", i.getName(), i.getCost());
            }
        }
        System.out.print("\n");
    }
    
    public void filterExpensive(double minCost){
        // loop over itemList and print all items with a cost higher than or equal to the specified value
        System.out.printf("\nThese are the items priced at greater than or equal to %.2f: ", minCost);
        for(Item i : itemList){
            if(i.getCost() >= minCost) {
                System.out.printf("\n%s - %.2f", i.getName(), i.getCost());
            }
        }
        System.out.print("\n");
    }
  
    public static void printStats(){
        // loop over storeList and print the name and the earnings'Store.java'public static void printAllItems(){
        System.out.println("\n\nSTORE STATS");
        for(Store i : storeList){
            System.out.printf("\nName: %s\nEarnings: %.2f\n", i.getName(), i.getEarnings());
        }
    }
}
