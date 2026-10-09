package javalabs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class lab1_1 {

    // ============ ЧАСТЬ 1: Обычный массив ============
    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println("]");
    }

    public static void transformArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr[i] = 0;
            else if (arr[i] < 0) arr[i] = 1;
        }
    }

    public static int countNegativeArray(int[] arr) {
        int count = 0;
        for (int v : arr) if (v < 0) count++;
        return count;
    }

    // ============ ЧАСТЬ 2: ArrayList ============
    public static void inputArrayList(ArrayList<Integer> list, Scanner sc, int size) {
        for (int i = 0; i < size; i++) list.add(sc.nextInt());
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("[ ");
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

    // ============ ЧАСТЬ 3: LinkedList ============
    public static void inputLinkedList(LinkedList<Integer> list, Scanner sc, int size) {
        for (int i = 0; i < size; i++) list.add(sc.nextInt());
    }

    public static void printLinkedList(LinkedList<Integer> list) {
        System.out.print("[ ");
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

    // ============ MAIN ============
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Часть 1: обычные массивы ---
        System.out.println("========== ЧАСТЬ 1: Обычные массивы ==========");
        int[] arr1 = new int[4];
        int[] arr2 = new int[3];
        int[] arr3 = new int[4];

        System.out.println("Введите 4 элемента массива 1:");
        inputArray(arr1, scanner);
        System.out.println("Введите 3 элемента массива 2:");
        inputArray(arr2, scanner);
        System.out.println("Введите 4 элемента массива 3:");
        inputArray(arr3, scanner);

        System.out.print("Массив 1: "); printArray(arr1);
        System.out.print("Массив 2: "); printArray(arr2);
        System.out.print("Массив 3: "); printArray(arr3);

        System.out.println("Отрицательных в массиве 1: " + countNegativeArray(arr1));
        System.out.println("Отрицательных в массиве 2: " + countNegativeArray(arr2));
        System.out.println("Отрицательных в массиве 3: " + countNegativeArray(arr3));

        transformArray(arr1); transformArray(arr2); transformArray(arr3);

        System.out.println("--- После трансформации ---");
        System.out.print("Массив 1: "); printArray(arr1);
        System.out.print("Массив 2: "); printArray(arr2);
        System.out.print("Массив 3: "); printArray(arr3);

        // --- Часть 2: ArrayList ---
        System.out.println("\n========== ЧАСТЬ 2: ArrayList ==========");
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите 4 элемента ArrayList:");
        inputArrayList(arrayList, scanner, 4);

        System.out.print("ArrayList:  "); printArrayList(arrayList);
        System.out.println("Отрицательных: " + countNegativeArrayList(arrayList));

        transformArrayList(arrayList);
        System.out.print("После 0/1: "); printArrayList(arrayList);

        // --- Часть 3: LinkedList ---
        System.out.println("\n========== ЧАСТЬ 3: LinkedList ==========");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Введите 4 элемента LinkedList:");
        inputLinkedList(linkedList, scanner, 4);

        System.out.print("LinkedList: "); printLinkedList(linkedList);
        System.out.println("Отрицательных: " + countNegativeLinkedList(linkedList));

        transformLinkedList(linkedList);
        System.out.print("После 0/1: "); printLinkedList(linkedList);

        scanner.close();
    }
}