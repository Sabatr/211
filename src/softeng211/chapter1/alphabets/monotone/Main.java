package softeng211.chapter1.alphabets.monotone;

import java.util.Scanner;

/**
 * The starting point of the program.
 * This application generates all monotone strings of length n over the alphabet {a,b}
 * This is an exercise from the book "Lectures on Discrete Mathematics for Computer Science" on pg.8, exercise 2.
 *
 * @author Brian Nguyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length, n: ");
        for (String value: new MonotoneGenerator().generate(Integer.parseInt(scanner.nextLine()))) {
            System.out.println(value);
        }
    }
}
