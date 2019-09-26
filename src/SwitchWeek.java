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
        int numberInput = 0;
        String dayOfWeek = "";

        // Read an integer using a do-while loop to continually read input.
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number from 1 - 7. Enter 0 to quit. --> ");
            numberInput = input.nextInt();

            // Use a switch statement to convert the number into the day of the week
            switch (numberInput) { // https://www.w3schools.com/js/js_switch.asp
                case 0:
                    break;
                case 1:
                case 7: // Put both cases together that print "Weekend!!!" If it is a weekend print "Weekend!!!"
                    System.out.println("Weekend!!!");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("What have you done!???! Enter a number between 0 and 7. 0,1,2,3,4,5,6,7");
            }
        } while (numberInput != 0);
    }
}
