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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();

        int zeroDigits = 0;
        int evenDigits = 0;
        int oddDigits = 0;

        String userInputString = String.valueOf(userInput);

        while (userInput > 0) { // Use a while loop to print the number of even, odd, and zero digits in an int value
            int i = userInput % 10;
            switch (i) {
                case 0:
                    zeroDigits++;
                    break;
                case 1:
                    oddDigits++;
                    break;
                case 3:
                    oddDigits++;
                    break;
                case 5:
                    oddDigits++;
                    break;
                case 7:
                    oddDigits++;
                    break;
                case 9:
                    oddDigits++;
                    break;
                case 2:
                    evenDigits++;
                    break;
                case 4:
                    evenDigits++;
                    break;
                case 6:
                    evenDigits++;
                    break;
                case 8:
                    evenDigits++;
                    break;
            }
            userInput /= 10;
        }

        System.out.println("The number " + userInput + " has " + zeroDigits + " zeroes, " + evenDigits + " even digits, and " + oddDigits + " odd digits.");

        /* int userInput = 0;
        String userChars = "0";
        String zeroDigits = "0";
        String evenDigits = "0";
        String oddDigits = "0";
        char[] userDigits = userChars.toCharArray();

        while () {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            userInput = input.nextInt();

            userChars = userChars.valueOf(userInput);

            System.out.println(userChars);

            System.out.println("The number " + userInput + " has " + zeroDigits + " zeroes, " + evenDigits + " even digits, and " + oddDigits + " odd digits.");
        }*/
    }
}
