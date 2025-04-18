/*
13. Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class
students in a single Dimensional Array. Find and display the following:
○ Number of students securing 75% and above in aggregate.
○ Number of students securing 40% and below in aggregate.
*/

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[60]; 

        int above75 = 0, below40 = 0;

        System.out.println("Enter the marks in Physics, Chemistry, and Maths for 20 students:");
        for (int i = 0; i < 20; i++) {
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            int maths = sc.nextInt();

            int totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300.0) * 100;

            if (percentage >= 75) {
                above75++;
            } else if (percentage <= 40) {
                below40++;
            }
        }

        sc.close(); // Close scanner

        System.out.println("Number of students securing 75% and above: " + above75);
        System.out.println("Number of students securing 40% and below: " + below40);
    }
}