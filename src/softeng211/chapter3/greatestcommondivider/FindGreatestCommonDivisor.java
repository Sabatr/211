package softeng211.chapter3.greatestcommondivider;

/**
 * This class implements the greatest common divisor algorithm.
 * NOTE: The gcd is the largest number that divides between two numbers.
 *
 * @author Brian Nguyen
 */
public class FindGreatestCommonDivisor {
    private int _one;
    private int _two;
    public FindGreatestCommonDivisor(int n, int m) {
        _one = n;
        _two = m;
    }

    /**
     * This method prints out the largest value at the end of the method.
     * This is correct as it will find a divisor between the two values.
     * This value will be overwritten when a new divisor is found.
     *
     */
    public int findGreatest() {
        int gcd = 1;
        int smallest;
        if (_one > _two) {
            smallest = _two;
        } else {
            smallest = _one;
        }
        for (int i = 1; i<= smallest ; i++) {
            if (_one % i == 0 && _two % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
