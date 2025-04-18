/*
11. Find a Subarray with Given Sum
○ Given an array of integers, find the subarray that sums to a given value S.
*/



public class Que11 {
    public static void findSubarray(int[] arr, int S) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink the window while sum exceeds S
            while (sum > S && start <= end) {
                sum -= arr[start];
                start++;
            }

            // If sum matches S, print result
            if (sum == S) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int S = 33;
        findSubarray(arr, S);
    }
}
