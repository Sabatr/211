package softeng211.chapter1.alphabets.monotone;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates a monotone string
 *
 * @author Brian Nguyen
 */
public class MonotoneGenerator {
    private enum binaryAlphabet {
        a,b
    }

    /**
     * Creates a String containing only a's of length 1<x<n
     * @param length: the longest length string
     * @return the list of monotone strings over the alphabet {a,b}
     */
    public List<String> generate(int length) {
        List<String> listOfStrings = new ArrayList<String>();
        for (int i = 1; i<=length ; i++) {
            String toBeAdded = "";
            for (int j = 1 ; j <= i ; j ++) {
                toBeAdded += binaryAlphabet.a.toString();
            }
            listOfStrings.add(toBeAdded);
        }
        return listOfStrings;
    }
}
