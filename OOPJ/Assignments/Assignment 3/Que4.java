/* 4. Count Even and Odd Numbers
○ Count the number of even and odd numbers in an array.
*/

public class Que4 {
    public static void countEvenOdd(int[] arr) {
       /*
	 if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return; 
        }
	*/

        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 78, 19, 3, 50};
        countEvenOdd(arr);
    }
}
