import java.util.*;

public class Camel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); 
        String line = sc.nextLine().trim();
        String[] words = line.split(",");

        String pattern = sc.next().trim();
        
        List<String> matchedWords = new ArrayList<>();
        
    
        for (String word : words) {
            word = word.trim();
        
            String abbr = word.replaceAll("[^A-Z]", "");
            
            if (abbr.startsWith(pattern)) {
                matchedWords.add(word);
            }
        }
        
    
        if (matchedWords.isEmpty()) {
            System.out.println("No match found");
            sc.close();
            return;
        }
        
        Collections.sort(matchedWords, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String abbrA = a.replaceAll("[^A-Z]", "");
                String abbrB = b.replaceAll("[^A-Z]", "");
                
        
                int comp = abbrA.compareTo(abbrB);
                if (comp != 0) {
                    return comp;
                }
            
                return a.compareTo(b);
            }
        });
        
    
        for (String word : matchedWords) {
            System.out.println(word);
        }
        
        sc.close();
    }
}
