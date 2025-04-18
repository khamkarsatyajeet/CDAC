// Tower of Hanoi 
import java.util.Scanner ;

class TowerOH {
	static void toh (int n, char s, char inter, char d) {
		if ( n == 1)
			System.out.println ("Move Disk 1 from " +s+ " to " +d);
		else {
			toh (n-1, s, d, inter) ;
			System.out.println ("Mive Disk " +n+ " from " +s+ " to " +d);
			toh (n-1, inter, s, d) ;
		} 
	}

	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println ("Enter how many disks you want but do not enter more than 5");
		int n = sc.nextInt ();
	//int n = 3;
	char a = 'A', b = 'B', c = 'C';
	System.out.println ("Tower of Hanoi with " +n+ " Disks ! ");
	toh (n, a, b, c) ;
	} 
}