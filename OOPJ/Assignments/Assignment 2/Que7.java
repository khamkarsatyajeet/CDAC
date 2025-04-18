/* Q7: Implement a Java program that checks whether a given year is a leap year or not using
logical (&&, ||) operators. */


class Que7 {
    public static void main(String[] args) {
        int year = 1900;

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}