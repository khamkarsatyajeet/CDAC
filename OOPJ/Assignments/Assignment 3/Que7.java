/*
7. Rotate an Array
○ Rotate the array to the right by k positions.
*/


import java.util.Arrays;

public class Que7 {
    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        int n = arr.length;
        k = k % n; 

        reverse(arr, 0, n - 1); 
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1); 

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateRight(arr, k);
    }
}
