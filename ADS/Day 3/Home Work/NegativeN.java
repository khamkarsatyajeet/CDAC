// Day 3 Home Work arrange negative no first then positive no.

import java.util.* ;

class NegativeN {
	static void rearrange (int arr[]) {
	    int n = arr.length ;
	    int newArr[] = new int [n] ; // new array of same size of first one
	    int index = 0;

	for (int i = 0; i < n; i++) {
	    if (arr[i] < 0){
	        newArr[index] = arr[i];
		index++;
	    }
	}

	for (int i = 0; i < n; i++) {
	    if (arr[i] >= 0) {
	        newArr[index] = arr[i] ;
		index++;
	    }	    
	}
	
	for (int i = 0; i < n; i++){
	    arr[i] = newArr[i] ;
	}
	}
	
	public static void main (String[] args) {

	int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6 } ;
	System.out.println ("Original Array:");
	System.out.println (Arrays.toString (arr));
	rearrange (arr);
	System.out.println ("Rearranged Array:");
	System.out.println (Arrays.toString(arr));
	
	Arrays.sort (arr);
	System.out.println ("Array after sorting");
	System.out.println (Arrays.toString (arr));
	}
}