/* Q18: Given a students percentage, print Pass if the percentage is 40 or above;
otherwise, print Fail, using only the ternary operator. */

class Que18 {
 static public void main(String [] args) {
	int a = 90 ;
	String b = (a >= 40) ? "Pass" : "Fail";
	System.out.println("Student is "+b);
	}
}