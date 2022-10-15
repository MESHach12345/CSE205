// Challenge Problem 6.17.12

import java.util.ArrayList;

public class FindAllArrayList {
    public static ArrayList<Integer> findAll(ArrayList<String> words, String searchedWord)
    {
        ArrayList<Integer> positions = new ArrayList<Integer>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i) == searchedWord) {
                positions.add(i);
            }
        }

        return positions;
    }
}
