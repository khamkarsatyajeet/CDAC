/* Q4: Write a program to find whether a given number is divisible by 3 without using the
modulus (%) or division (/) operators.
Hint: Use subtraction and bitwise shifts. */

// import java.util.* ;

class Que4 {
 public static void main (String[] args) {
	int n = 16;

	if (n<0) {
	n = -n ;
	}
	while (n>3) {
	n = (n & 3) + (n >> 2);
	}
	if(n==0 || n==3) {
	System.out.println("Divisible by 3");
	}
	else {
	System.out.println("Not Divisible by 3");
	}
	}
}