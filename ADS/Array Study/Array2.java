class Array2 {
	public static void main (String[] args) {
		int[] data = {5, 10, 15, 20};
		for (int i = data.length - 1; i > 0; i -= 2)
			System.out.println (data[i] + " ");
	}

}