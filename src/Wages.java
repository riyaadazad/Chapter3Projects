import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Wages {
    /*
     * Write a program that prompts the user for, and then reads in a number of hours worked from the user.
     * Prompt the user for wages, and read them in.
     * Calculate the amount the user should be paid.
     * Add overtime (person should be paid time and a half - 1.5 times their normal salary) for any time they work over 40 hours.
     * Add a check to ensure that a person does not work over 168 hours or under 0 hours.
     * This check should use a while loop.
     * This check should be complete before the value for a wage is entered.
     * Use DecimalFormat or NumberFormat when displaying the output for the salary.
     * Create a method called getValidHours to ensure the user enters a number in the correct range and returns the number of hours worked.
     * Testing: Check values less than 0, 0, 1 - 39, 40, 41, 41 - 168, and values greater than 168.
     */

    public static void main(String[] args) {
        // TODO Use a while loop to check that a person does not work over 168 hours or under 0 hours BEFORE a value for wage is entered
        /**
         * Ensures the number of hours worked is between 0 and 168
         * @param input the filestream to read keyboard input
         * @return the number of hours worked
         */
        public static int getValidHours(Scanner input) { // Create a method getValidHours to ensure that the user enters a number in the correct range and returns the number of hours worked:
            Scanner input = new Scanner(System.in); // Prompt the user for the number of hours worked

            System.out.print("Enter the number of hours worked this week: ");
            Double hoursWorked = input.nextDouble();


        }

        Scanner input = new Scanner(System.in); // Prompt the user for the number of hours worked
        System.out.print("Enter your hourly wage: "); // Prompt the user for wages
        Double hourlyWage = input.nextDouble();

        Double payCheck = hoursWorked * hourlyWage; // Calculate the amount the user should be paid

        if (hoursWorked > 40.0) { // Include overtime (time and a half - 1.5 times their normal salary)
            Double nonOvertimeHours = 40.0 * hourlyWage; // Calculate how much money is not overtime
            Double overtimePay = payCheck - nonOvertimeHours; // Subtract money that is not overtime from payCheck
            overtimePay = overtimePay * 1.5; // Calculate overtimePay
            payCheck = overtimePay + nonOvertimeHours; // Add nonOvertimeHours to the final total after calculating overtimePay
        }

        NumberFormat formatToNumber = NumberFormat.getInstance(Locale.US); // Use DecimalFormat or NumberFormat when displaying the output for the salary
        System.out.println("You made " + "$" + formatToNumber.format(payCheck) + " this week."); // https://www.geeksforgeeks.org/numberformat-class-java/
    }
}
