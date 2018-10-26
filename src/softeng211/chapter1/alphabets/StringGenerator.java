package softeng211.chapter1.alphabets;

import java.util.List;

/**
 * Creates a string based on the lengh the user wants and a random alphabet
 *
 * @author Brian Nguyen
 */
public class StringGenerator {
    public String generate(int length,List<String> alphabet) {
        String randomGeneratedString ="";
        for (int i = 1; i <= length; i ++) {
            int randomNumber = (int)(Math.random()*alphabet.size());
            randomGeneratedString += alphabet.get(randomNumber);
        }
        return randomGeneratedString;
    }
}
