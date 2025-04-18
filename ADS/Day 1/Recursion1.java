class Recursion1 {
	static void show () {
		System.out.println ("In show method !");
		show ();
	}
	
	public static void main (String[] args) {
		show ();
	}
}