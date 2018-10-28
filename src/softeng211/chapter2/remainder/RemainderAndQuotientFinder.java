package softeng211.chapter2.remainder;

/**
 * This class finds the quotient, q, and the remainder r such that
 * n = q*m + r.
 *
 * @author Brian Nguyen
 */
public class RemainderAndQuotientFinder {
    private int _n;
    private int _m;
    public RemainderAndQuotientFinder(int n, int m) {
        _n = n;
        _m = m;
        find();
    }
    private void find() {
        System.out.println("This meets the requirements: " + _n + " = " + _n/_m + "*" +_m+" + "+_n % _m  );
    }
}
