package softeng211.chapter3.primefactorization;

/**
 * This is based on the algorithm in pg 22 in Lectures on Discrete
 * Mathematics for Computer Science. The algorithm is as follows:
 *
 * PrimeFactorization(n)
 *  1) Initialize s = n
 *  2) Find the smallest factor m > 1 of s. Output m.
 *  3) If s = m then stop. Otherwise, set s to be equal to s/m
 *  and go to line 2 above.
 *
 *  My implementation of this algorithm will output it into the console.
 * @author Brian Nguyen
 */
public class PrimeFactorization {
    public PrimeFactorization(int n) {
        findPrimes(n);
    }

    /**
     * Prints out the factors. If calls findPrimes again if the factor
     * is the number itself.
     * @param n
     */
    private void findPrimes(int n) {
        int s = n;
        int smallestFactor = findSmallestFactor(s);
        System.out.println(smallestFactor);
        if (s == smallestFactor) {
            return;
        } else {
            s = s / smallestFactor;
        }
        findPrimes(s);
    }

    /**
     * This method finds the smallest factor of a given number.
     * NOTE: that this will always find the smallest factor as it will return
     * whenever it finds the first factor.
     * @param number
     * @return
     */
    private int findSmallestFactor(int number) {
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
