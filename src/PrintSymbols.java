/*
This program will do the following:
Print out a series of symbols

**********
**********
**********
**********

*
**
***
****
*****


    *
   **
  ***
 ****
*****

For the first:
1. Set up two for loops
    a. The first one represents the rows, and goes up to 4
    b. The second one represents the columns, and goes up to 10
2. Inside the second loop, it will print the "*" symbol
3. Inside the first loop, it will enter a new line

For the second:
1. Set up two for loops
    a. The first one represents the rows, and goes up to 5
    b. The second one represents the columns, and goes up to whatever the counter value of the first loop is
        i. e.g. if in the first loop the counter = 2, then when the second loop starts it will only iterate two times
2. The inner loop will print the "*" symbol
3. The outer loop will enter a new line

For the third:
1. Set up two for loops
    a. The outer loop represents the rows, and goes up to 5
    b. The inner loop represents the columns. This time it also goes to 5
2. In the inner loop, it needs to know how many spaces it has to print out before it can print out an "*" symbol.
    a. The "*" symbols printed start at 1, go up to 5
    b. The number of " " required start at 4, and decrease to 0
    c. Can use an IF statement to determine when to print " " and when to print "*"
    d. IF the value of the inner counter is greater than the value of the outer counter THEN
        print " "
       ELSE
        print "*"
       ENDIF

 */

public class PrintSymbols {
    public static void main (String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
