package softeng211.chapter3.findfactors;

/**
 * This class implements the FindFactors algorithm.
 * The algorithm used for this is from page 21 in Lecture of Discrete
 * Mathematics for Computer Science. The algorithm is stated as the following:
 *
 * FindFactors(n)
 *  1) Initialize i = 1.
 *  2) If i > n then stop. Otherwise, if i divides n then output i.
 *  3) Increment i by 1, and then go to line 2.
 *
 * My implementation just prints out the factors to the console.
 *
 * @author Brian Nguyen
 */
public class FindFactors {
    private int _number;
    public FindFactors(int n) {
        _number = n;
        findFactors();
    }

    private void findFactors() {
        int i = 1;
        while (i<= _number) {
            if (_number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
