// Factorial program

/*
import java.util.Scanner;

class Factorial {
	static int fact ( int n ) {
		if (n <=1 ) 
			return 1;
		else 
			return n*fact(n-1);
		} 

	public static void main (String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();
		fact (n);
		System.out.println ("Factorial of " +n+ " is: "+ fact (n) );  
		}
}
*/



//Factorial using iteration

import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Enter a number");
	    int num = sc.nextInt();
	    
	    int fact = 1;
	    for (int i = 1; i<=num; i++){
	        fact *= i;
	    }
		System.out.println("Factorial of "+num+" is "+ fact);
	}
}

