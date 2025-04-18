//Day 3 Home Work

import java.util.*;

class ArrayDuplicateHW1 {
	public static void main (String[] args) {
		int[] arr = {0, 3, 1, 2} ;
		Set <Integer> seen = new HashSet <> () ;
		Set <Integer> duplicate = new TreeSet <> () ;
		
		for (int num : arr) {
			if (!seen.add(num)) {
				duplicate.add(num);
			}
		}		
		
		if (duplicate.isEmpty()) {
			System.out.println ("-1");
		}
		else {
		  for  (int num : duplicate) {
		    System.out.println (num + " ") ;
		  }
		}
		 
	}
}