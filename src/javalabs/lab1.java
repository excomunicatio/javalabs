package javalabs;
import java.util.Scanner;
public class lab1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[3];
        int[] arr3 = new int[4];
        System.out.println("Введите 4 элемента для первого массива");
        for (int i=0; i < arr1.length; i++) arr1[i] = scanner.nextInt();
        System.out.println("Введите 3 элемента для второго массива");
        for (int i=0; i < arr2.length; i++) arr2[i] = scanner.nextInt();
        System.out.println("Введите 4 элемента для третьего массива");
        for (int i=0; i < arr3.length; i++) arr3[i] = scanner.nextInt();
        System.out.print("Первый массив: [");
        for(int val : arr1) System.out.print(val + " ");
        System.out.println("]");
        System.out.print("Второй массив: [");
        for(int val : arr2) System.out.print(val + " ");
        System.out.println("]");
        System.out.print("Третий массив [");
        for(int val : arr3) System.out.print(val + " ");
        System.out.println("]");
    }
}