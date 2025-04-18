// HWC Day Table Find table 



class Table {

    static int printTable(int n, int i) {
        if (i <= 1) {
            System.out.println(n + " * " + i + " = " + (n * i));
            return printTable(n, i + 1);
        }
        else if (i > 10) {
            return n; 
        }
        else {
            System.out.println(n + " * " + i + " = " + (n * i));
            return printTable(n, i + 1);
        }
    }

    public static void main(String[] args) {
        int n = 21; 
        System.out.println("Multiplication Table of " + n + ":");
        printTable(n, 1);
    }
}