package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 67, 836, 23, 4, 734, 88, 1, 0, 74, 373, 13, 7, -32, 56, -88, 32, 5, 290, 32 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.print("After Sorting: [ ");
        ob.display(arr);
        System.out.print("]");
    }

    void merge(int[] arr, int left, int middle, int right) {
        int low = middle - left + 1;
        int high = right - middle;

        int[] L = new int[low];
        int[] R = new int[high];

        int i, j;

        for (i = 0; i < low; ++i) {
            L[i] = arr[left + i];
        }

        for (j = 0; j < high; ++j) {
            R[j] = arr[middle + 1 + j];
        }


        int k = left;
        i = 0;
        j = 0;

        while (i < low && j < high) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void mergeSort(int[] arr, int left, int right)
    {
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    void display(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}

