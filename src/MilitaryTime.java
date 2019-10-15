import java.util.Scanner;

public class MilitaryTime {
    /*
     * Write a program that reads in an integer (representing military time) and converts it to standard time (AM or PM).
     * Military time starts at 0 (for 12:00 AM).
     * Military time ends at 2359 (or 11:59 PM).
     * The user will continue to enter values for military time until a sentinel value of -1 is entered.
     * Make sure you handle any special cases.
     * Also make sure you do not allow illegal times!
     * Chcek your work carefully (in fact, you should discuss "illegal" times with your friends, and have them give you sample data to check your work with).
     * Some examples are: (not shown)
     *
     * GRADING RUBRIC:
     * +1 Program terminates when the sentinel value is -1.
     * +9 9 times will be entered similar to the examples above.
     * Test any integer greater or equal to 0 as a possible time to be entered.
     *
     * PROGRAMMING STYLE EXPECTATIONS (POTENTIAL DEDUCTIONS MAY OCCUR):
     * Variable names are practical and self-documenting.
     * Code is consistently indented properly.
     * Code is commented.
     * Anything weird happens.
     * Only use break statements when using switch statements.
     */

    public static void main(String[] args) {
        int END_PROGRAM = -1; // Sentinel value
        int userInput = 0;

        while (userInput != -1) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter military times. Enter -1 to continue.");

            if (userInput == END_PROGRAM) {
                System.out.println("You've entered the sentinel value of -1. Program terminated.");
                System.exit(1);
            }
        }
    }
}
