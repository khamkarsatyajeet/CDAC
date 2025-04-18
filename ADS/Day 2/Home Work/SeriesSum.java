public class SeriesSum {

    static double calculateSeries(int i, int n, double sum) {
        if (i > n) {
            return sum; 
        } else {
            if (i % 2 == 0) {
                sum -= 1.0 / i; 
            } else {
                sum += 1.0 / i; 
            }
            return calculateSeries(i + 1, n, sum); // Recursive call
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        double result = calculateSeries(1, n, 0.0);
        System.out.println("Sum of the series for N = " + n + " is: " + result);
    }
}

/*




*/