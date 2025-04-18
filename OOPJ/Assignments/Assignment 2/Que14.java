/* Q14: Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.
Hint: Use n & (n - 1). */



class Que14 {
    public static void main(String[] args) {
        int num = 29;

        int count = 0;
        while (num > 0) {
            num = num & (num - 1); 
            count++; 
        }

        System.out.println("Number of 1s in binary representation: " + count);
    }
}