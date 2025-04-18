import java.util.Arrays ;

class Array5 {
	public static void main (String[] args) {
		int[] a = {1, 2, 3};
		int b = a;
		b[0] = 99;
		System.out.println (Arrays.toString(b));

	}
}