// Challenge Program 6.9.1

import java.util.Scanner;

public class FindNext {
    
    public static int findNext(int[] values,  int searchedValue, int start) {
        int position = start;
        boolean found = false;
        
        for (int i = start; i < values.length; i++) {
            if (values[i] == searchedValue && found == false) {
                found = true;
                position = i;
            } else {
                continue;
            }
        }

        return position;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] arr1 = { 3, 1, 4, 1, 5, 9, 2, 6 };
        System.out.println(findNext(arr1, in.nextInt(), in.nextInt()));
        in.close();
    }
}
