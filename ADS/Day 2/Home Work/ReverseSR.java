public class ReverseSR{
	static String reverse(String str){
		if(str.isEmpty()){
			return str;
		}	
		else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}
	public static void main(String args[]){
		String input1 =  "CDACMumbai";
		System.out.println("Input: " +input1);
		System.out.println("Output: "+reverse(input1));
	
		String input2 = "Alice";
		System.out.println("Input: " +input2);
		System.out.println("Output: "+reverse(input2));
	}
}