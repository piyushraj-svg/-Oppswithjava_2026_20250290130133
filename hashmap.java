package oops;
import java.util.*;

class ShoppingsItem {
    int id;
    String name;
    int price;

    ShoppingsItem(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer, ShoppingItem> items = new HashMap<>();

        items.put(101, new ShoppingItem(101, "Laptop", 50000));
        items.put(102, new ShoppingItem(102, "Mouse", 500));
        items.put(103, new ShoppingItem(103, "Keyboard", 1500));
        items.put(104, new ShoppingItem(104, "Phone", 20000));

        for (Map.Entry<Integer, ShoppingItem> entry : items.entrySet()) {
            entry.getValue().display();
        }
    }
}