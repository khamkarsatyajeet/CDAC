// Sum of n natural numbers 

import java.util.Scanner ;

class NaturalNS {

	static int sum (int n) {
		if ( n<= 0 )
			return 0;
		else
			return n + sum (n-1);
	}

	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Enter a number till which you want sum :");
	int n = sc.nextInt (); 
	sum (n);
	System.out.println ("Sum of natural noumbers till " +n+ " is " +sum(n) );
	}
}

