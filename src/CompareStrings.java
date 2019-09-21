import java.util.Scanner;

public class CompareStrings {
    /*
     * Write a program that reads in two strings, compares them, and prints out the one that comes first alphabetically (the "smaller" of the the two).
     * You will need to use the compareTo method because you are comparing two of the same type of objects.
     * LEARNING POINT: Try upper versus lower case, and see what happens - don't worry about the results though - just notice what they are.)
     * Note the double quote marks in the answers below - they should appear.
     */

    public static void main(String[] args) {
        // Read in two strings
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String firstString = input.next();

        System.out.print("Enter a second string: ");
        String secondString = input.next();

        // Compare strings with compareTo method and print out the string that comes first alphabetically

        if (firstString.compareTo(secondString) < secondString.compareTo(firstString)) {
            System.out.println("The smaller value of \"" + firstString + "\" and \"" + secondString + "\" is \"" + firstString + "\".");
        } else if (secondString.compareTo(firstString) < firstString.compareTo(secondString)) {
            System.out.println("The smaller value of \"" + firstString + "\" and \"" + secondString + "\" is \"" + secondString + "\".");
        } else if (firstString.compareTo(secondString) == secondString.compareTo(firstString)) {
            System.out.println("The values are both \"" + firstString + "\".");
        } else {
            System.out.println("OMG Look what you have done to the program!");
        }
    }
}
