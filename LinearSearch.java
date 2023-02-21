package SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 4, 7, 24, 64, 88, 92, 108, 153 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value : ");
        int search = scanner.nextInt();

        int result = liner(arr, search);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index: " + result);
    }

    public static int liner(int[] arr, int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
