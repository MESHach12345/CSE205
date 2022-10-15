// Challenge Activity 6.7.4

public class ReverseOrderArray {
    public static String[] reverse(String[] words) {
        String[] result = new String[words.length];

        String temp = words[0];
        
        for (int i = 0; i < result.length-1; i++) {
            result[i] = words[result.length-1-i];
        }

        result[result.length-1] = temp;

        return result;
    }
}
