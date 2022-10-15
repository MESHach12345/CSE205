// Challenge Problem 6.17.9

import java.util.ArrayList;

public class SwapFirstlastArrayList {
    
    public static void swapFirstlastArrayList(ArrayList<String> names) {
        if (names.size() != 0) {
            String temp = names.get(0);
            String firstName = names.get(names.size() - 1);
            String lastName = temp;
            names.set(0, firstName);
            names.set(names.size() - 1, lastName);
        }
    }
}
