/* Q3: Implement a program that calculates the sum of digits of an integer using modulus
(%) and division (/) operators. */

class Que3 {
 public static void main (String[] args) {
	int num = 12345, sum = 0;
	while (num > 0) {
	sum += num % 10;
	num /= 10;
	}
	System.out.println("Addition of integers is: "+sum);
	}
}