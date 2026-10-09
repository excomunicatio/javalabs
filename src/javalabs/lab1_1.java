package javalabs;

import java.util.ArrayList;
import java.util.LinkedList;

public class lab1_1 {

    // ===== Методы для ArrayList =====
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("ArrayList:  [ ");
        for (int v : list) System.out.print(v + " ");
        System.out.println("]");
    }

    // ===== Методы для LinkedList =====
    public static void printLinkedList(LinkedList<Integer> list) {
        System.out.print("LinkedList: [ ");
        for (int v : list) System.out.print(v + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("=== Часть 2: ArrayList ===");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(-3);
        arrayList.add(0);
        arrayList.add(7);
        printArrayList(arrayList);

        System.out.println("\n=== Часть 3: LinkedList ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(-3);
        linkedList.add(0);
        linkedList.add(7);
        printLinkedList(linkedList);
    }
}