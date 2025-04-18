/* Q25: Implement a program that reverses an integer number without using string
conversion (StringBuilder or toCharArray).
Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }  */


class Que25 {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
	System.out.println("Given number:" + num);
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;         }

	
        System.out.println("Reversed number: " + rev);
    }
}