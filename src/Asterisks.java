public class Asterisks {
    /*
     * Write a program to generate the following:
     *
     * Use the shell code given.
     * Note - Your program must use nested for-loops to generate this output. (Part A)
     *
     * Continue your program by writing a portion to generate the following.
     * Note - Your program must use nested for-loops to generate this output. (Part B)
     *
     * Continue your program by writing a portion to generate the following.
     * Note - Your program must use nested for-loops to generate this output. (Part C)
     *
     * Hint: It might help you to generate the below first, then generate the above (not shown)
     *
     * Continue your program by writing a portion to generate the following.
     * Note - Your program must use nested for-loops to generate this output. (Part D)
     *
     * Finally, complete your program by generating the following.
     * Note - Your program must use nested for-loops to generate this output. (Part E - Final Program)
     *
     * YOUR FINAL OUTPUT SHOULD PRINT OUT ALL PARTS (A - E)
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("*");
            for (i = 1; i <= 9; i++) {
                System.out.println("**");
            }
            for (i = 2; i <= 8; i++) {
                System.out.println("***");
            }
            for (i = 3; i <= 7; i++) {
                System.out.println("****");
            }
            for (i = 4; i <= 6; i++) {
                System.out.println("*****");
            }
            for (i = 5; i <= 5; i++) {
                System.out.println("******");
            }
        }
    }
}
