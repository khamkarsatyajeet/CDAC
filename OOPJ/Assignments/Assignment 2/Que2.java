/* Q2: Write a program to check whether a given number is even or odd using only bitwise
operators.
Hint: Use n & 1 to check. */

class Que2 {
public static void main (String[] args) {
	int a = 10;

	if ((a & 1) == 0 ) {
	 System.out.println ("Even");
	}
	else {
	 System.out.println ("Odd");
	}
	}
}