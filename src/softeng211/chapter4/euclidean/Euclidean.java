package softeng211.chapter4.euclidean;

/**
 * This class implements the Euclidean algorithm found in Lectures of Discrete
 * Mathematics for Computer Science, pg. 29. The algorithm is as follows:
 *
 * Euclidean(n,m)
 *  1) If n = m then output n as gcd(n,m) and stop.
 *  2) If n > m then initialize a = n and b = m. Otherwise, initialize a = m, and b = n.
 *  3) Apply the Division Theorem to a and b by integers q and r such that a = q * b + r,
 *  where 0 <= r < b.
 *  4) If r = 0 then output b as gcd(n,m) and stop. Otherwise, set a = b, and b = r. Go to line 3.
 *
 * We implemented a gcd algorithm in chapter 3, however it was not very efficient.
 *
 * @author Brian Nguyen
 */
public class Euclidean {
    public int findGCD(int n,int m) {
        int a;
        int b;
        int gcd = 1;
        if (n == m) {
            return n;
        }
        if (n > m) {
            a = n;
            b = m;
        } else {
            a = m;
            b = n;
        }
        int remainder = a % b;
        if (remainder == 0) {
            return b;
        } else {
            gcd = findGCD(b,remainder);
        }
        return gcd;
    }

}
