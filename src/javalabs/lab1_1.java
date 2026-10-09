package javalabs;

import java.util.ArrayList;

public class lab1_1 {
    public static void main(String[] args) {
        // ===== ЧАСТЬ 1: Обычные массивы (сокращенно) =====
        System.out.println("=== Часть 1: Обычные массивы ===");
        int[] arr1 = {5, -3, 0, 7};
        System.out.print("Массив 1: [ ");
        for (int v : arr1) System.out.print(v + " ");
        System.out.println("]");

        // ===== ЧАСТЬ 2: ArrayList =====
        System.out.println("\n=== Часть 2: ArrayList ===");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(-3);
        list1.add(0);
        list1.add(7);

        System.out.print("ArrayList 1: [ ");
        for (int v : list1) System.out.print(v + " ");
        System.out.println("]");
    }
}