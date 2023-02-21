package SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 4, 7, 24, 64, 88, 92, 108, 153 };
        int n = arr.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value : ");
        int search = scanner.nextInt();

        int result = binary(arr, 0, n - 1, search);
        if (result == -1)
            System.out.println("Element is not present.");
        else
            System.out.println("Element found at index: "
                    + result);
    }


    public static int binary(int[] arr, int left, int right, int search) {

        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == search)
                return middle;

            if (arr[middle] > search)
                return binary(arr, left, middle - 1, search);

            return binary(arr, middle + 1, right, search);
        }
        return -1;
    }
}
