package softeng211.chapter4.congruence;

/**
 * This class determines if two integers are congruent modulo p.
 * Two integers are congruent modulo p if p is a factor of n - m.
 * Or rather (n - m) / p = 0.
 *
 * @author Brian Nguyen
 */
public class DetermineCongruence {

    /**
     *  These variables follow the equation:
     *  n congruence m (mod p)
     * @param n
     * @param m
     * @param p
     */
    public void deterermine(int n,int m,int p) {
        if ((n - m) % p == 0) {
            System.out.println(n+","+m+" IS congruent modulo " + p);
        } else {
            System.out.println(n+","+m+" IS NOT congruent modulo " + p);

        }
    }
}
