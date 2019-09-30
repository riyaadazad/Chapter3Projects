import java.util.Scanner;

public class SumEven {
    /*
     * Design and implement an application that reads an integer value and prints the sum of all even integers between 2 and the input value, inclusive.
     * Use a do-while statement to ensure the input value is greater than 2.
     * Prompt the user accordingly.
     * You MUST use a for loop to find the sum.
     * Create a method called getValidNumber to ensure the user enters a number greater than 2. You will want to create a global class variable for your Scanner object (This is a different way to organize your code than in the Wages program)
     */

    /**
     * Ensures the user enters a number greater than two.
     * @return a number greater than two.
     */
    public static int getValidNumber() {

    }

    public static void main(String[] args) {
        int userInt = 2;

        // Use a do-while loop to print the sum of all even ints between 2 and the inclusive input value
        do {
            // Read an int value
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number greater than 2: ");
            userInt = input.nextInt();

            // TODO Use a for loop to find the sum
            for (int i = 0; i >= userInt; i++) {

            }

            int sumEven = userInt;

            System.out.println("The sum of the even numbers through " + userInt + " is " + sumEven);
        } while (userInt >= 2);
    }
}
