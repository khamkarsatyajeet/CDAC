/* Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or -.
Hint: Use bitwise XOR ^ operator. */

class Que1 {
 public static void main (String args []) {
	int a = 5, b = 10;
	System.out.println("Before Swapping: a = "+a+" b = "+b);
	a = a ^ b;
	b = a ^ b;
	a = a ^ b;
	System.out.println("After Swapping: a = " +a+" b = "+b);
	}
}