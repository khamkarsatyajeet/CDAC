// Linear Searching home work Day 3

class LSearch {
	static int search (int arr[], int x) {
		int n = arr.length ;
		for (int i = 0; i < n; i++) {
		  if (arr [i] == x) 
			return i;
		}
		return -1;
	}
	
	public static void main (String[] args) {
	
	int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170} ;
	int key = 11;
	int result = search (arr, key);
	if (result == -1) 
		System.out.println ("Element " +key+ " is not present in arr []");
	else 
		System.out.println ("Element " +key+ " is in present in arr []");

	}
}