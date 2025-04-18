/* 5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.*/


class Que5 {
	public static void main (String[] args) {
	int binaryNum = 0b1010;
	int octalNum = 012;
	int hexNum = 0xA;
	float f = (float) 3.14;
	double d = 2.17828;
	System.out.println("Binary (0b1010): "+ binaryNum);
	System.out.println("Octal (012): "+ octalNum);
	System.out.println("Hexadecimal (0xA): "+ hexNum);
	System.out.println("Float (3.14f): "+ f);
	System.out.println("Double (2.17828): "+ d);
	}

}