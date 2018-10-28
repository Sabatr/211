package softeng211.chapter3.lowestcommonmultiple;

/**
 * The main of the program.
 * This implements the lowest common multiple algorithm.
 *
 * The output of the case lcm(36,48) should be 144 as 36*4 and 48*3=144
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new FindLowestCommonMultiple().findLowestCommonMultiple(36,48));
    }
}
