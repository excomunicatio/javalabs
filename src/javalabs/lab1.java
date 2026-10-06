package javalabs;

public class lab1 {
        static void main(String[] args) {
        int[] arr1 = {5, -3, 0, 7};

        System.out.print("Исходный массив: [ ");
        for (int val : arr1) System.out.print(val + " ");
        System.out.println("]");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                arr1[i] = 0;
            }
        }

        System.out.print("После замены положительных на 0: [ ");
        for (int val : arr1) System.out.print(val + " ");
        System.out.println("]");
    }
}