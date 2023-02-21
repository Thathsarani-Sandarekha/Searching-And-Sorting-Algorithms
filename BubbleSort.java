package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();

        int[] arr = { 67, 836, 23, 4, 734, 88, 1, 0, 74, 373, 13, 7, -32, 56, -88, 32, 5, 290, 32 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        bubbleSort(arr, arr.length);
        System.out.print("After Sorting: [ ");
        ob.display(arr);
        System.out.print("]");
    }

    static void bubbleSort(int[] arr, int n)
    {
        if (n == 1)
        {
            return;
        }

        for (int i=0; i<n-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }

    void display(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

}
