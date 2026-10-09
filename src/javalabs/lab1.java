package javalabs;

import java.util.Scanner;

public class lab1 {

    // Метод ввода массива
    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Метод вывода массива
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println("]");
    }

    // Метод трансформации: положительные = 0, отрицательные = 1
    public static void transformArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr[i] = 0;
            else if (arr[i] < 0) arr[i] = 1;
        }
    }

    // Метод подсчета отрицательных
    public static int countNegative(int[] arr) {
        int count = 0;
        for (int v : arr) if (v < 0) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Отрицательных в массиве 1: " + countNegative(arr1));
        System.out.println("Отрицательных в массиве 2: " + countNegative(arr2));
        System.out.println("Отрицательных в массиве 3: " + countNegative(arr3));

        transformArray(arr1);
        transformArray(arr2);
        transformArray(arr3);

        System.out.println("--- После трансформации ---");
        System.out.print("Массив 1: "); printArray(arr1);
        System.out.print("Массив 2: "); printArray(arr2);
        System.out.print("Массив 3: "); printArray(arr3);

        scanner.close();
    }
}