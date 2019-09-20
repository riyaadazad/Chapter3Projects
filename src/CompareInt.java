import java.util.Scanner;

public class CompareInt {
    /*
    * Write a program that prompts the user to enter two ints and then reads them in.
    * Your program should then compare them with inequalities and tell you which is smaller, or if they are the same.
    * */

    public static void main(String[] args) {
        // Prompt the user to enter 2 ints and then read them in
        Scanner input = new Scanner(System.in); // Declare a Scanner to record user input

        System.out.print("Enter an integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter a second integer: ");
        int secondInt = input.nextInt();

        // Compare the ints with inequalities and tell which is smaller or if they are the same
        if (firstInt < secondInt) {
            System.out.println("The smaller value of " + firstInt + " and " + secondInt + " is " + firstInt + ".");
        } else if (secondInt < firstInt) {
            System.out.println("The smaller value of " + firstInt + " and " + secondInt + " is " + secondInt + ".");
        } else if (firstInt == secondInt) {
            System.out.println("The values are both " + firstInt + ".");
        } else {
            System.out.println("You've broken the universe!"); // Just for fun :-)
        }

    }
}