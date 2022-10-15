import java.util.ArrayList;

public class Test {
    
    public static ArrayList<Integer> wordsOfLength(ArrayList<String> words, String searchedWord) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i) == searchedWord) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<String>();

        words.add("Hello");
        words.add("World");
        words.add("Hello");
        
        System.out.println(wordsOfLength(words, "Hello"));
    }
}
