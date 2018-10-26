package softeng211.chapter1.alphabets;

import java.util.ArrayList;
import java.util.List;

/**
 * Randomly generates an alphabet.
 * NOTE: an alphabet is a finite collection of symbols.
 * For simplicity, we will just be using symbols from the english alphabet
 *
 * @author Brian Nguyen
 */
public class Alphabet {
    private enum alphabet {
        a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
    }
    public List<String> random(int size) {
        List<String> alphabet = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String toBeAdded = Alphabet.alphabet.values()[(int)(Math.random()*25)].toString();
            if (!alphabet.contains(toBeAdded)) {
                alphabet.add(toBeAdded);
            } else {
                i--;
            }
        }
        return alphabet;
    }
}
