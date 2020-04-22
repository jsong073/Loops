/*
This program does the following:
Have the user input a number and print all numbers from that input value to 1
Have the user input a number and print the sum of all numbers from that inputted value to 1
 */

import java.util.Scanner;

public class InputNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        String numbers = "";

        System.out.print("Enter a number: ");
        num = input.nextInt();
        for (int i = num; i > 0; i--) {
            numbers += i + " ";                 //Stores the numbers in a String so they can be printed later
        }

        System.out.print("Enter another number: ");
        num = input.nextInt();
        for (int i = num; i > 0; i--) {
            sum += i;
        }

        System.out.println("All the numbers in the first number are: ");
        System.out.println(numbers);
        System.out.println("The sum of all the numbers in the second number is: ");
        System.out.println(sum);
    }
}
