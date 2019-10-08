import java.util.Scanner;

public class CountVowels {
    /*
     * Your goal is to design and implement an application that reads a string from the user and then determines and prints how many vowels (a,e,i,o,u), consonants, spaces, and "other characters" appear in the entire string.
     * First - read in a string.
     * Use the nextLine() method from the Scanner class to read an entire line of text.
     * Convert it to lowercase.
     * Determine its length.
     * Create a loop that strips off one character at a time.
     * Create a separate counter for each vowel (a counter for 'a', a counter for 'e', etc.)
     * Also have one counter for consonants, one for spaces, and one for other characters.
     * Declare them and initialize them all to zero outside of your loop.
     * Inside your loop, check each character to see whether it is a vowel, consonant, space, or other character.
     * Increment the appropriate counter.
     * Afer you have processed the entire string, print out how many of each of those was present in the string.
     * (Your program should contain 8 System.out.println() statements to output the results of your findings.)
     */

    public static void main(String[] args) {
        // Use nextLine() method to read a string from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String userPhrase = input.next();

        // Convert string to lowercase and determine its length
        userPhrase = userPhrase.toLowerCase();
        int userPhraseLength = userPhrase.length();

        int aCount = 0; // Create a counter for each vowel
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        int consonantCount = 0; // Create a counter for consonants
        int spacesCount = 0; // Create a counter for spaces
        int otherCharacterCount = 0; // Create a counter for other characters

        // Create a loop that strips off one character at a time
        for (int i = 0; i >= userPhraseLength; i++) {
            if (userPhrase.charAt(i) = "a") { // TODO Inside the loop, check each character to see if it is a vowel, consonant, space, or other character and increment the appropriate counter
                aCount++;
            }
        }

        // Print how many vowels, consonants, spaces, and other characters each appear in the string
        System.out.println("The number of 'a': " + aCount);
        System.out.println("The number of 'e': " + eCount);
        System.out.println("The number of 'i': " + iCount);
        System.out.println("The number of 'o': " + oCount);
        System.out.println("The number of 'u': " + uCount);
        System.out.println("The number of consonants: " + consonantCount);
        System.out.println("The number of spaces: " + spacesCount);
        System.out.println("The number of other characters: " + otherCharacterCount);
    }
}
