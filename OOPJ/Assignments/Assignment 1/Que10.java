/* 11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).  */


class Que10 {
 public static void main (String[] args) {
	int a = 0;
	Boolean b1 = a>0;
	Boolean b2 = a % 2 == 0; 
	if (b1 && b2) {
	System.out.println("THe given number is both positive and even!");
	} else if (!b1) {
	System.out.println("The given number is not positive !");
	} else {
	System.out.println("The given number is not positive!");
	}
	if (b1 || b2) {
	System.out.println("Given number is either positive or even!");
	}
	}
}
