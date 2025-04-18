import java.util.*;

class Array4 {
	public static void main (String[] args) {
		int[] a = {2, 4, 6, 8} ;
		for (int i = 0; i < a.length; i++) 
			a[i] = a[i] + a[(a.length - 1) - i];
		System.out.println (Arrays.toString(a));
	}

}