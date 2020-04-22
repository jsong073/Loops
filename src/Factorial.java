/*
This program will find the factorial of a user-submitted integer
 */

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int factorial = 1;          //initialized at 1 instead of 0 because it's being multiplied

        System.out.print("Enter a number and I will find the factorial: ");
        num = input.nextInt();

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
