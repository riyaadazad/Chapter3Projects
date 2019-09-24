import java.util.Scanner;

public class SwitchWeek {
    /*
     * Write a program that continually reads an integer and prints out the corresponding day of the week (Sunday = 1, Monday = 2, ..., Saturday = 7) until the user enters a 0 to quit.
     * Use a switch statement to convert the number into the day of the week.
     * If it is a weekend (Sunday or Saturday), then print "Weekend!!!" instead of the dat.
     * Within the switch statement, put both cases together that print "Weekend!!!"
     * Use a do-while loop to continually reading input.
     */

    public static void main(String[] args) {
        // Let the user know that they can type "0" at any time to quit
        System.out.println("Type 0 at anytime to quit.");
        int numberInput = 0;

        // TODO Read an integer and print out the corresponding day of the week
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number from 1 - 7. Enter 0 to quit. --> ");
            numberInput = input.nextInt();
        } while (numberInput != 0);

        // TODO Use a switch statement to convert the number into the day of the week
            // TODO Put both cases together that print "Weekend!!!"

        // TODO If it is a weekend print "Weekend!!!"

        // TODO Use a do-while loop to continually reading input
    }
}
