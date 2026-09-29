
import java.util.Scanner;

public class WildcardMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String p = scanner.nextLine().trim();
        
        System.out.println(isMatch(s, p) ? 1 : 0);
    }
    
    static boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int starIdx = -1;   // last position of '*' found in pattern
        int match = 0;      // position in s to resume matching from after a '*'
        
        int sLen = s.length();
        int pLen = p.length();
        
        while (i < sLen) {
            // Case 1: characters match exactly or pattern has '?'
            if (j < pLen && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            }
            // Case 2: pattern has '*', record position and try zero match first
            else if (j < pLen && p.charAt(j) == '*') {
                starIdx = j;
                match = i;
                j++;
            }
            // Case 3: mismatch, but we have a previous '*' to fall back on
            else if (starIdx != -1) {
                j = starIdx + 1;
                match++;
                i = match;
            }
            // Case 4: no match and no '*' to backtrack to
            else {
                return false;
            }
        }
        
        // Consume any remaining '*' in pattern
        while (j < pLen && p.charAt(j) == '*') {
            j++;
        }
        
        return j == pLen;
    }
}
 

