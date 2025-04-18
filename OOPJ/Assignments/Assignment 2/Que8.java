/* Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true.
Hint: Use logical operator (&&, ||)  */ 

class Que8 {
 static public void main (String [] args) {
	boolean a = true, b = false, c = true;
	boolean result = (a && b) || (b && c) || (a && c) ;
	System.out.println("At least two are true: "+result);
	}

}