/*
10. Find Intersection and Union of Two Arrays
○ Find the intersection and union of two unsorted arrays
*/

import java.util.*;

public class Que10 {
    private static boolean binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return true;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void findUnion(int[] arr1, int[] arr2) {
        TreeSet<Integer> unionSet = new TreeSet<>();
        for (int num : arr1) unionSet.add(num);
        for (int num : arr2) unionSet.add(num);

        System.out.println("Union: " + unionSet);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // Sorting for Binary Search
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : arr2) {
            if (binarySearch(arr1, num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("Intersection: " + intersectionSet);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {3, 6, 9, 10};

        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
    }
}