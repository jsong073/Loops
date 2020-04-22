
public class PrintNumbers {
    public static void main (String[] args) {
        String oneToTen = "";
        String tenToOne = "";
        String oneToTwentyEven = "";
        String oneToTwentyOdd = "";
        int ten = 10;                            //used as a "reverse" counter. Decrements while the counter increments
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i <= 10) {                      //Only runs the code in the conditional up until i = 10
                oneToTen += i + " ";
                tenToOne += ten + " ";
                ten--;
                sum += i;                       //Adds the value of the counter to sum
            }
            if ((i % 2) == 0) {                 //Checks if the counter is even
                oneToTwentyEven += i + " ";
            } else if ((i % 2) != 0) {          //Checks if the counter is odd
                oneToTwentyOdd += i + " ";
            }
        }
        System.out.println(oneToTen);
        System.out.println(tenToOne);
        System.out.println(oneToTwentyEven);
        System.out.println(oneToTwentyOdd);
        System.out.println(sum);

    }
}
