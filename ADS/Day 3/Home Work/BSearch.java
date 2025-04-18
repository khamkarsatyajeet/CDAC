// same home work problem with binanry Day 3

import java.util.* ;
class BSearch {
	static int bsearch (int arr[],int x, int l, int h) {
		if (h >= l) {
		  int mid = l+(h-1)/2 ;
		  if (arr[mid] == x)
		     return mid ;
		  if (arr[mid] > x)
		     return bsearch (arr, x, l, mid-1) ;

		  return bsearch (arr, x, mid+1, h) ;
		}
		return -1;
	}
	public static void main (String[] args) {
		int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170} ;
		Arrays.sort(arr);
		int n = arr.length;
		int key = 130;
		int result = bsearch (arr, key, 0, n-1);
		if (result == -1)
		  System.out.println ("Element " +key+ " is not present in arr ");
	else 
		System.out.println ("Element " +key+ " is present in arr");

	}
} 