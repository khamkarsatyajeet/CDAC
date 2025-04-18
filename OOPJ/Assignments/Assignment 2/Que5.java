/* Q5: Write a Java program to swap two numbers using the += and -= operators only. */

class Que5 {
static public void main (String[] args) {
	int a = 5, b = 10;
	System.out.println("Before Swapping: a = "+a+", b = "+b);
	a += b;
	b = a - b;
	a -= b;
	System.out.println("After Swapping: a = "+a+", b = "+b);

	}
}