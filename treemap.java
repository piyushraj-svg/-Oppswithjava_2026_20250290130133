package oops;

import java.util.*;

class Studentm {
    int id;
    String name;

    // Constructor
    Studentm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    void display() {
        System.out.println(id + " " + name);
    }
}

public class treemap {
    public static void main(String[] args) {

        TreeMap<Integer, Studentm> students = new TreeMap<>();

        students.put(103, new Studentm(103, "Rahul"));
        students.put(101, new Studentm(101, "Piyush"));
        students.put(104, new Studentm(104, "Aman"));
        students.put(102, new Studentm(102, "Ravi"));

        // Display students
        for (Studentm s : students.values()) {
            s.display();
        }
    }
}