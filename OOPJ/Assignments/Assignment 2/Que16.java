/* Q16: Write a program that determines whether a given number is positive, negative, or
zero using only the ternary  */

class Que16 {
 static public void main (String[] args) {
	int a = 0;
	String str = (a==0) ? "zero" : (a>0) ? "Positive" : "Negative";
	System.out.println("The "+a+" is: " +str);
 	} 

}