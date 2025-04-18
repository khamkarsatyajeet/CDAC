import java.util.Arrays;

class Array3 {
	public static void main (String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	System.out.println ("Before Array: " + Arrays.toString (arr));

	arr [2] = 10;
	System.out.println ("After Arrray: " + Arrays.toString (arr));
	}

}