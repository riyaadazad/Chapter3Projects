import java.util.Scanner;

public class CompareChar {
    /*
    * Write a program that prompts the user to enter two chars and then reads them in.
    * You will need to read the input as a string using the next() method for the Scanner class, and then convert the string to a char before comparing the letters.
    * Your program should then compare them using inequalities.
    * Note the single quotes in the answers below.
    * They should appear (escape clauses).
    * LEARNING POINT: Unicode/ASCII characters are in lexicographical order.
    * You never need to use and/or memorize the numerical values of a character.
    * */

    public static void main(String[] args) {
        // Prompt the user to enter two chars and read the input as a string using the next() method for the Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String firstString = input.next(); // There is no input.nextChar();

        System.out.print("Enter a second character: ");
        String secondString = input.next();

        // Convert the string to a char before comparing the letters
        char firstChar = firstString.charAt(0);
        char secondChar = secondString.charAt(0);

        // Compare them using inequalities
        if (firstChar < secondChar) {
            System.out.println("The smaller value of " + "\'" + firstChar + "\'" + " and " + "\'" + secondChar + "\'" + " is " + "\'" + firstChar + "\'" + ".");
        } else if (secondChar < firstChar) {
            System.out.println("The smaller value of " + "\'" + firstChar + "\'" + " and " + "\'" + secondChar + "\'" + " is " + "\'" + secondChar + "\'" + ".");
        } else if (firstChar == secondChar) {
            System.out.println("The values are both " + "\'" + firstChar + "\'" + ".");
        } else {
            System.out.println("Oh no! What have you done??? Error Code: Haha");
        }

    }
}
