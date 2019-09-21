import java.util.Scanner;

public class LeapYear {
    /*
     * Design and implement an application that reads an integer value representing a year input by the user.
     * The purpose of the program is to determine if the year is a leap year (and therefore has 29 days in February) in the Gregorian calendar.
     * An error message should be produced if the year input is less than 1582 (the first year of the Gregorian calendar).
     * For example:
     * A year is a leap year if it is divisible by 4, unless it is also divisible by 100 but not 400.
     * 2003 is not a leap year because it is not divisible by 4.
     * 2004 is a leap year because it is divisible by 4, but not by 100.
     * 1900, 2100, 2200, and 2300 are not leap years because they are divisible by 100 but not by 400.
     * 2000 and 2400 are leap years because they are divisible by 400.
     * Other numbers to Test:
     * Any value less than 1582.
     * 1582, 1584, 1586
     * Other dates
     * Find a website to check your date with leap years
     */

    public static void main(String[] args) {
        // Read an integer value representing a year input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yearInput = input.nextInt();

        // Determine if the year is a leap year in the Gregorian calendar
        if (yearInput < 1582) { // Produce an error message if the year input is less than 1582
            System.out.println("What are you doing? Are you crazy?? 1582 was the first year of the Gregorian calendar. Seriously, enter a number less than 1582. You're making my job harder. Okay, try again.");
        } else if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) { // https://www.tutorialspoint.com/Check-if-a-large-number-is-divisible-by-3-or-not-in-java
            System.out.println("The year " + yearInput + " is a leap year, which means February had 29 days in that year.");
        } else {
            System.out.println("Sorry, but " + yearInput + " is not a leap year.");
        }
    }
}
