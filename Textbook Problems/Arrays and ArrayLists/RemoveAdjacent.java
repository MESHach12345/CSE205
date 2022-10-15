// Challenge Problem 6.17.15

import java.util.ArrayList;

public class RemoveAdjacent {
    public static void removeAdjacentDuplicates(ArrayList<String> words)
    {
        for(int i=0; i<words.size()-1; i++) {       
            if (words.get(i) == words.get(i+1)) {
                words.remove(i+1);
            }

            if (words.get(i) == words.get(i+2)) {
                words.remove(i+2);
            }
        }
    }
}
