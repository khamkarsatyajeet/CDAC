/* Q23: Given a number, find whether it is odd or even using the & bitwise operator and print
the result without using if-else. */



class Que23 {
    public static void main(String[] args) {
        int num = 7; 
        
	String result = (num & 1) == 0 ? "Even" : "Odd";

        System.out.println("The number " + num + " is: " + result);
    }
}