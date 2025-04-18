/*  Q12: Write a Java program to multiply a number by 8 without using * or / operators.
Hint: Use bitwise left shift (<<).  */


class Que12 {
    static public void main(String[] args) {
        int a = 5; 
       
        int b = a << 3; 

        System.out.println(a + " multiplied by 8 is: " + b);
    }
}