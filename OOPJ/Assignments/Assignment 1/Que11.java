/* 12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers. */

class Que11 {
 public static void main (String[] args) {
	int a = 10, b = 20 ;
	System.out.println("Initial value of a is: "+ a + " Initial value of b is: " +b);
	a += b;
	System.out.println("Value after a += b is: "+ a );
	a -= b;
	System.out.println("Value after a -= b is: "+ a );
	a *= b;
	System.out.println("Value after a *= b is: "+ a );
	a /= b;
	System.out.println("Value after a /= b is: "+ a );
	a %= b;
	System.out.println("Value after a %= b is: "+ a );
	}
}
