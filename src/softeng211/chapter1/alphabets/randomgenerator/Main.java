package softeng211.chapter1.alphabets.randomgenerator;

import java.util.Scanner;

/**
 * The main of the application program.
 * The point of this is to generate a random string of a certain alphabet.
 *
 * @author Brian Nguyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the string: ");
        try {
            int lengthOfString = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the length of the alphabet: ");
            int lengthOfAlphabet = Integer.parseInt(scanner.nextLine());
            System.out.println(new StringGenerator().generate(lengthOfString,new Alphabet().random(lengthOfAlphabet)));
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            System.exit(1);
        }

    }
}
