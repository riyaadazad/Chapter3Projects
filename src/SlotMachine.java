public class SlotMachine {
    /*
     * Design and implement an application that simulates a simple slot machine in which three numbers between 0 and 9 are randomly selected and printed side by side (with a tab between them).
     * Create a sum that represents the amount of money the player has.
     * The player starts with $20.00.
     * Every time the player plays subtract $0.50.
     * If all three of the numbers come up the same, print out a message and award the $5.00.
     * If any two numbers are the same, print a message and award the user $2.00.
     * At the end of each round, print out the amount of money that the player has remaining.
     * Continue playing until the player chooses to stop or the player runs out of money.
     * Print a message and end the game if the user runs out of money.
     * Use constants wherever possible so that the dollar values are easily adjustable and you can test if you run out of money.
     * Define all your constants at the top of the program (not shown).
     * Print out dollar values in the proper format.
     * You may need to use the NumberFormat class (JSS p. 96).
     * Have the user enter a 'P' for "pull" and a 'Q' for "quit".
     * This way the user does not waste keystrokes.
     * HINT: Change the TOTAL to a low value, such as 2.00 so you can test the program terminating when you run out of money.
     *
     * GRADING RUBRIC:
     * +1 Slot machine displays 3 numbers on each turn
     * +2 Deducts $0.50 after each play
     * +2 Adds $5.00 for a Jackpot
     * +2 Adds $2.00 for a Winner
     * +1 Displays the amount of money remaining
     * +1 Program terminates when the player quits
     * +1 Program terminates when the player runs out of money.
     *
     * PROGRAMMING STYLE EXPECTATIONS (POTENTIAL DEDUCTIONS MAY OCCUR):
     * Variable names are practical and self-documenting.
     * Code is consistently indented properly.
     * Code is commented.
     * Anything weird happens.
     * Only use break statements when using switch statements.
     */

    // "Use constants wherever possible"
    static final double TOTAL = 20.00; // The money that every player starts out with
    static final double COST = 0.50; // The money that is subtracted each time the player plays
    static final double THREE_IN_A_ROW = 5.00; // The money that is awarded to the player for a three-in-a-row (JACKPOT!)
    static final double TWO_IN_A_ROW = 2.00; // The money that is awarded to the player for a two-in-a-row (WINNER!)

    public static void main(String[] args) {
        double playerMoney = TOTAL;

        // TODO RUN THIS IN A LOOP

            // TODO Program terminates IF user runs out of money

            // TODO Program terminates IF user quits with a 'Q'

            // TODO IF user "pulls" with a 'P' then generate 3 random numbers between 0 and 9 (print them side-by-side with a tab)

            // TODO IF all 3 numbers are the same, print a message and award the user $5 (THREE_IN_A_ROW)

            // TODO IF 2 numbers are the same, print a message and award the user $2 (TWO_IN_A_ROW)

            // TODO At the end of the round, print the amount of money remaining
    }
}
