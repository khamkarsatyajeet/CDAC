/*
3.  Find the Second Largest Element
○ Find the second-largest element in the given array
*/



class Que3 {
   /* public static void findSecondLargest (int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println ("Array should have at least two distinct elements.");
            return;
        }
*/
	public static void findSecondLargest (int[] arr) {


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 78, 19, 3, 50};
        findSecondLargest(arr);
    }
}