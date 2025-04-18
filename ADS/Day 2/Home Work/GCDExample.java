

public class GCDExample {

   
    static String gcdFormula(int n) {
        if (n == 1) {
            return "int"; 
        }
        return "gcd(int, " + gcdFormula(n - 1) + ")";
    }

    
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        int n = 3; 
        System.out.println("GCD Formula for n = " + n + ":");
        System.out.println(gcdFormula(n));

       int a = 5, b = 4;
        System.out.println("\nCalculating GCD of " + a + " and " + b + ": " + gcd(a, b));
    }
}