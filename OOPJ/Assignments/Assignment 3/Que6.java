/*
6. Remove Duplicates from a Sorted Array
○ Remove duplicate elements from a sorted array without using extra space.
*/

import java.util.Arrays;

public class Que6 {
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Empty array case
        }

        int uniqueIndex = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i]; 
            }
        }

        return uniqueIndex + 1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
