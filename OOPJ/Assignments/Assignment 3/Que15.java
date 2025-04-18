/*
15. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.
example - Input :
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 }
nums2 = { 1, 2, -3, 4, 5, 6 }
nums3= { 1, 2, -2, 3, 4, 5, 6 }
Output:
Sub-arrays with 0 sum : [1, 3, -7, 3]
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]
Sub-arrays with 0 sum : [1, 2, -3]
Sub-arrays with 0 sum : [2, -2]

*/

import java.util.*;
public class Que15{
	public static void main(String[] args){
		
		int A[] = {1, 3, -7, -3, 2, 4, 1, -3, -2, 5};
		System.out.println(Arrays.toString(A));
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<A.length; i++){
			list.removeAll(list);
			int sum =0;
			for(int j=i; j<A.length; j++){
				sum += A[j];
				list.add(A[j]);
				if(sum==0){
					System.out.println(list.toString());
				}
			}
		}
	}
}