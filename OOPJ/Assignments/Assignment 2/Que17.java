/* Q17: Implement a Java program that finds the minimum of four numbers using nested
ternary operators.  */

class Que17 {
  static public void main (String [] args) {
	int a = 12, b = 7, c = 15, d = 9;
	int min = ( a<b ) 
		    ? ((a < c) 
			? ((a < d) ? a : d)
			: ((c < d) ? c : d))
		    :  ((b < c)
			? ((b < d) ? b : d)
			: ((c < d) ? c : d));
	System.out.println("The minimum number is: "+min);
	}

}
