/*  Q10: Write a program to determine if a character is a vowel or a consonant using the
ternary operator. */


class Que10 {
    public static void main(String[] args) {
        char ch = 'a'; 
        
       // ch = Character.toLowerCase(ch);

    
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        ? "Vowel" 
                        : "Consonant";

        System.out.println(ch + " is a " + result);
    }
}