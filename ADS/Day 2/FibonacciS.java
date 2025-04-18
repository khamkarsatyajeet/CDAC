//Fibonacci Series 

import java.util.Scanner;

class FibonacciS {
	static int fibo (int n) {
	if (n <= 1)
		return n;
	else
		return fibo (n-1) + fibo (n-2);

		// System.out.println (n);
	}

	public static void main (String[] args) {
	
	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Enter a number till which you want Fibonacci Series: ");
	int num = sc.nextInt();
	sc.close ();
	
	System.out.println ("Fibonacci Series upto " +num+ ": ");

	for (int i = 0; i <= num; i++) {
		fibo (num);
	System.out.print( fibo(i) + " ");

		//System.out.println ("i is "+i);
	}
	//System.out.println ("num is "+num);
	}
}