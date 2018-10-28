package softeng211.chapter2.reduced;

/**
 * This class reduces produces a fraction's reduced (simplest) form.
 *
 * @author Brian Nguyen
 */
public class FractionReducer {
    private int _originalNumerator;
    private int _originalDenominator;

    public FractionReducer(int numerator, int denominator) {
        _originalNumerator = numerator;
        _originalDenominator = denominator;
        reduce();
    }

    /**
     * Finds the reduced values by testing if a number is divisible in both the numerator and denominator.
     */
    private void reduce() {
        int reducedNumerator = _originalNumerator;
        int reducedDenominator = _originalDenominator;
        int smallestNumber;
        if (_originalDenominator < _originalNumerator) {
            smallestNumber = _originalDenominator;
        } else {
            smallestNumber = _originalNumerator;
        }

        for (int i = 1; i<=smallestNumber;i++) {
            if (_originalNumerator % i == 0 && _originalDenominator % i == 0) {
                reducedNumerator = _originalNumerator / i ;
                reducedDenominator = _originalDenominator / i;
            }
        }
        System.out.println("The reduced form of: " + _originalNumerator + "/" + _originalDenominator + " is " + reducedNumerator+"/" + reducedDenominator);
    }
}
