/*
8. Merge Two Sorted Arrays
○ Merge two sorted arrays into a single sorted array without using extra space.
*/

import java.util.Arrays;

public class Que8 {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;

        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];
                int k;
                for (k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }

        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);
    }
}