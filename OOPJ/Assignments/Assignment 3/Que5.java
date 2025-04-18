/*
5. Find Sum and Average
○ Compute the sum and average of all elements in the array.
*/

public class Que5 {
    public static void sumAndAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum of elements: " + sum);
        System.out.printf("Average of elements: % .4f \n" , average);
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 78, 19, 3, 50};
        sumAndAverage(arr);
    }
}