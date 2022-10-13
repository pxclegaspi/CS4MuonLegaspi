package ex05muonlegaspi;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String n){
    // Initialize name to parameter and earnings to zero
    name = n;
    earnings = 0;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList<Item>();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if(index > itemList.size()) {
        System.out.printf("Sorry, there are only %d items in %s.%n", itemList.size(), this.getName());
    } else {
        earnings += itemList.get(index).getCost();
        System.out.printf("%s has been sold. Earnings have increased to %f.%n", itemList.get(index).getName(), earnings);
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    for(int i = 0; i < itemList.size(); i++) {
        if(name != itemList.get(i).getName()) {
            if(i < itemList.size() - 1) {
                System.out.printf("%s doesn't sell %s.%n", this.getName(), name);
            }
        } else {
            earnings += itemList.get(i).getCost();
            System.out.printf("%s has been sold. Earnings have increased by %f.%n", itemList.get(i).getName(), earnings);
            break;
        }
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if(itemList.contains(i)) {
        earnings += i.getCost();
        System.out.printf("%s has been sold. Earnings have increased by %f.%n", i.getName(), earnings);
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
   itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(int i = 0; i < itemList.size(); i++) {
        if(itemList.get(i).getType().equals(type)) {
            System.out.printf("%s is a %s.%n", itemList.get(i).getName(), type);
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(int i = 0; i < itemList.size(); i++) {
        if(itemList.get(i).getCost() <= maxCost) {
            System.out.printf("%s's cost is less than or equal to %f.%n", itemList.get(i).getName(), maxCost);
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(int i = 0; i < itemList.size(); i++) {
        if(itemList.get(i).getCost() >= minCost) {
            System.out.printf("%s's cost is greater than or equal to %f.%n", itemList.get(i).getName(), minCost);
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(int i = 0; i < storeList.size(); i++) {
        System.out.printf("%s got %f.%n", storeList.get(i).getName(), storeList.get(i).getEarnings());
    }
  }
}
