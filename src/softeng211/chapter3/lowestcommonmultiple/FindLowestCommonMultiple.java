package softeng211.chapter3.lowestcommonmultiple;

import softeng211.chapter3.greatestcommondivider.FindGreatestCommonDivisor;

/**
 * This class implements the lowest common multiple algorithm.
 * It does this by using the following statement:
 * gcd(n,m)*lcm(n,m) = n*m.
 * Therefore, to find the lowest common multiple we simply rearrange the equation.
 *
 * @author Brian Nguyen
 */
public class FindLowestCommonMultiple {

    public int findLowestCommonMultiple(int n, int m) {
        int gcd = new FindGreatestCommonDivisor(n,m).findGreatest();
        int multiply = n*m;
        return multiply/gcd;
    }
}
