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
        // Part A
        System.out.println("Part A:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Part B
        System.out.println("Part B:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // TODO Part C
        System.out.println("Part C:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        // TODO Part D
        System.out.println("Part D:");

        // TODO Part E
        System.out.println("Part E:");

    }
}
