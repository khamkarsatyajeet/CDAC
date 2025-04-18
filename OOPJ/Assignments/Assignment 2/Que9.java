/* Q9: Implement a Java program that checks if a number is within a specific range (20 to
50) without using if-else.
Hint: Use logical AND (&&) in a print statement.  */


class Que9 {
    public static void main(String[] args) {
        int num = 55; 

        System.out.println("Number is within range: " + (num >= 20 && num <= 50));
    }
}