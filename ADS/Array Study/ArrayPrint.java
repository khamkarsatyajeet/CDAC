import java.util.Arrays ;
class ArrayPrint {

	public static void main (String[] args) {
		int[] arr = new int [5];
			for (int i = 0; i <= arr.length-1; i++)
				arr[i] = i*2 ;
		
		System.out.print ("\nPrinting by for loop \n");
		for (int i = 0; i <= arr.length - 1; i++)
		System.out.print (arr[i] + ", ");

		System.out.print ("\nPrinting by for each loop \n");
		for (int i : arr)
		System.out.print (i + ", ");

		System.out.print ("\nPrinting by Arrays.toString method \n");
		System.out.print (Arrays.toString (arr));
	}


}
