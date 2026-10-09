package javalabs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class lab1_1 {

    // ===== Методы для ArrayList =====
    public static void inputArrayList(ArrayList<Integer> list, Scanner sc, int size) {
        for (int i = 0; i < size; i++) list.add(sc.nextInt());
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("ArrayList:  [ ");
        for (int v : list) System.out.print(v + " ");
        System.out.println("]");
    }

    public static void transformArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) list.set(i, 0);
            else if (list.get(i) < 0) list.set(i, 1);
        }
    }

    public static int countNegativeArrayList(ArrayList<Integer> list) {
        int count = 0;
        for (int v : list) if (v < 0) count++;
        return count;
    }

    // ===== Методы для LinkedList =====
    public static void inputLinkedList(LinkedList<Integer> list, Scanner sc, int size) {
        for (int i = 0; i < size; i++) list.add(sc.nextInt());
    }

    public static void printLinkedList(LinkedList<Integer> list) {
        System.out.print("LinkedList: [ ");
        for (int v : list) System.out.print(v + " ");
        System.out.println("]");
    }

    public static void transformLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) list.set(i, 0);
            else if (list.get(i) < 0) list.set(i, 1);
        }
    }

    public static int countNegativeLinkedList(LinkedList<Integer> list) {
        int count = 0;
        for (int v : list) if (v < 0) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Часть 2: ArrayList ===");
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите 4 элемента ArrayList:");
        inputArrayList(arrayList, scanner, 4);
        printArrayList(arrayList);

        System.out.println("\n=== Часть 3: LinkedList ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Введите 4 элемента LinkedList:");
        inputLinkedList(linkedList, scanner, 4);
        printLinkedList(linkedList);

        scanner.close();
    }
}