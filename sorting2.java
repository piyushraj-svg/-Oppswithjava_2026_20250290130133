package oops;

import java.util.*;

class ShoppingItem implements Comparable<ShoppingItem> {

    int id;
    String name;
    int price;

    // Constructor
    ShoppingItem(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Sorting by price
    public int compareTo(ShoppingItem item) {
        return this.price - item.price;
    }

    // Display item
    void display() {
        System.out.println(id + "  " + name + "  " + price);
    }
}

public class sorting2 {
    public static void main(String[] args) {

        ArrayList<ShoppingItem> items = new ArrayList<>();

        items.add(new ShoppingItem(101, "Laptop", 50000));
        items.add(new ShoppingItem(102, "Mouse", 500));
        items.add(new ShoppingItem(103, "Keyboard", 1500));
        items.add(new ShoppingItem(104, "Phone", 20000));

        // Sort using compareTo()
        Collections.sort(items);

        System.out.println("ID   Item       Price");

        for (ShoppingItem item : items) {
            item.display();
        }
    }
}