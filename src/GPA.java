import java.util.Scanner;

public class GPA {
    /*
     * Write an application to calculate the Grade Point Average (GPA) of a student.
     * Convert each grade into a numerical value (A+ = 4.3, A = 4.0, A- = 3.7, etc.).
     * Use a loop to continue entering grades until a sentinel value of "Q" is entered.
     * You must use a switch statement to determine the GPA for one letter grade.
     * If an invalid grade is entered, print "Invalid grade."
     * Include a method called getGPA that accepts a String as a parameter that represents the grade and converts it to a numerical value.
     * The method getGPA will return -1 if an invalid grade is entered.
     * Testing: Ensure the total number of classes does not increase each time an invalid grade is entered.
     * LEARNING POINT: 14.3 / 5 equals 2.86, but the computer rounds differently with floating point values (double).
     * For example, the fraction 1/3 cannot be stored as a fraction.
     * The computer has limited space in memory to store decimal values.
     * With multiple calculations with decimals, this can create inaccurate calculations.
     * Think about when you use the graphing utility on your graphing calculator.
     * Have you ever calculated a zero or intercept and seen x = 3 represented as x = 2.9999998? Same concept.
     */

    private static final String SENTINEL = "Q";

    /**
     * Calculates the GPA of one grade into its
     * numerical equivalent
     *
     * @param grade the grade
     * @return the GPA
     */
    private static double getGPA(String grade) {
        // Calculate the student's Grade Point Average (GPA) and convert it to a numerical values
        double GPA = 0;
        return GPA;
    }

    public static void main(String[] args) {
        // Use a loop to enter grades until sentinel "Q"
        String userInput = "";
        double GPA = 0.0;

        while (userInput != SENTINEL) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a grade or Q to quit: ");
            userInput = input.next();

            // Use a switch statement to determine the GPA
            switch (userInput) {
                case "A+":
                    GPA = 4.3;
                    System.out.println("GPA: " + GPA);
                    break;
                case "A":
                    GPA = 4.0;
                    System.out.println("GPA: " + GPA);
                    break;
                case "A-":
                    GPA = 3.7;
                    System.out.println("GPA: " + GPA);
                    break;
                case "B+":
                    GPA = 3.3;
                    System.out.println("GPA: " + GPA);
                    break;
                case "B":
                    GPA = 3.0;
                    System.out.println("GPA: " + GPA);
                    break;
                case "B-":
                    GPA = 2.7;
                    System.out.println("GPA: " + GPA);
                    break;
                case "C+":
                    GPA = 2.3;
                    System.out.println("GPA: " + GPA);
                    break;
                case "C":
                    GPA = 2.0;
                    System.out.println("GPA: " + GPA);
                    break;
                case "C-":
                    GPA = 1.7;
                    System.out.println("GPA: " + GPA);
                    break;
                case "D+":
                    GPA = 1.3;
                    System.out.println("GPA: " + GPA);
                    break;
                case "D":
                    GPA = 1.0;
                    System.out.println("GPA: " + GPA);
                    break;
                case "D-":
                    GPA = 0.7;
                    System.out.println("GPA: " + GPA);
                    break;
                case "F":
                    GPA = 0.0;
                    System.out.println("GPA: " + GPA);
                    break;
                case SENTINEL :
                    System.exit(1);
                    break;
                default: // Print "Invalid Grade" for an invalid grade
                    System.out.println("Invalid grade.");
                    break;
            }
        }
    }
}
