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
     *
     * @return a number greater than two.
     */
    public static int getValidNumber(Scanner input) {
        int userInt = 0;

        // Use a do-while loop to print the sum of all even ints between 2 and the inclusive input value
        do {
            // Read an int value
            System.out.print("Enter a number greater than 2: ");
            userInt = input.nextInt();
        } while (userInt < 2);

        return userInt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInt = getValidNumber(input);

        int sumEven = 0;

        // Use a for loop to find the sum
        for (int i = 0; i >= userInt; i++) {
            int a = userInt % 2;
            switch (a) {
                case 0:
                    sumEven++;
                    break;
                case 1:
                    sumEven++;
                    break;
                case 3:
                    sumEven++;
                    break;
                case 5:
                    sumEven++;
                    break;
                case 7:
                    sumEven++;
                    break;
                case 9:
                    sumEven++;
                    break;
                case 2:
                    sumEven++;
                    break;
                case 4:
                    sumEven++;
                    break;
                case 6:
                    sumEven++;
                    break;
                case 8:
                    sumEven++;
                    break;
            }

            System.out.println("The sum of the even numbers through " + userInt + " is " + sumEven);
        }
    }
}