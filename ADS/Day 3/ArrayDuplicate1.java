
class ArrayDuplicate1 {
	public static void main (String[] args) {
		int[] a = {1, 3, 2, 4, 2, 7, 8, 8, 3};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < a.length; i++) {
			if (a [i] == a [j])
				System.out.println (a[j]);	
			} 
		}
	}
}
