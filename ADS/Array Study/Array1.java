// array declaration and display of array by for and for each loop

class Array1 {

	public static void main (String[] args) {
	int[] arr = new int [5]  ;
	arr[0] = 10;
	arr[1] = 50;
	arr[3] = 20;
	arr[4] = 770;
	arr[2] = 30;

	int s = arr [4];
	System.out.println (s);
	
	System.out.println ("Printing by for loop");

	for (int i = 0; i <= arr.length-1; i ++) {
		System.out.print (arr[i] + " ");
	}

	System.out.println ("\nPrinting by for each loop");

	for (int x : arr) {
		System.out.print (x + " ");	
	}
	} 

}

