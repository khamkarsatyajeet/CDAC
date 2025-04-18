/* Q19: Write a Java program that checks whether a character is uppercase, lowercase, or
not a letter using only the ternary operator. */


class Que19 {
    public static void main(String[] args) {
        char ch = 's'; 
               String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter"
                     : (ch >= 'a' && ch <= 'z') ? "Lowercase Letter"
                     : "Not a Letter";

      
        System.out.println("Character: " + ch);
        System.out.println("Result: " + result);
    }
}