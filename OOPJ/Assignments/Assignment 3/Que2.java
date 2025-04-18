/* 2. Reverse an Array
○ Reverse the given array in place. */


import java.util.Arrays;

class Que2 {
    public static void rev (int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
       	    int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        rev(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}