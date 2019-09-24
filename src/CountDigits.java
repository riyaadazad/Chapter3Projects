import java.util.Scanner;

public class CountDigits {
    /*
     * Design and implement an application that determines and prints the number of even, odd, and zero digits in an int value read from the keyboard.
     * NOTE: This means leading zeroes will be ignored.
     * You MUST use a while loop to accomplish this task.
     * How can you read one digit at a time?
     * Do you read left-to-right or right-to-left?
     * How do you know when there are no more digits to be read?
     */

    public static void main(String[] args) {
        int userInput = 0;
        String userChars = "0";
        String zeroDigits = "0";
        String evenDigits = "0";
        String oddDigits = "0";
        char[] userDigits = userChars.toCharArray();

        // TODO Use a while loop to print the number of even, odd, and zero digits in an int value
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            userInput = input.nextInt();

            userChars = userChars.valueOf(userInput);

            System.out.println(userChars);

            System.out.println("The number " + userInput + " has " + zeroDigits + " zeroes, " + evenDigits + " even digits, and " + oddDigits + " odd digits.");
        }
    }
}
