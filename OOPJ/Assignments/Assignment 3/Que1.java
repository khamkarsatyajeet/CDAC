/* 1. Find the Largest and Smallest Element
○ Given an array, find the smallest and largest elements in it */

class Que1 {
    public static void larg (int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }

    public static void main (String[] args) {
        int[] arr = {12, 5, 78, 19, 3, 50};
        larg(arr);
    }
}