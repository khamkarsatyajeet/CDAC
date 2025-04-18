/* Q6: Write a program to find the largest of three numbers using only the ternary operator
(? :).  */


class Que6 {
 static public void main (String[] args){
	int a = 15, b = 25, c = 10;
	int lar = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c) ;
	System.out.println("Largest number from given numbers is: " + lar);
	}
}