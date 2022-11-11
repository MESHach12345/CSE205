package Recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class NameFinder {
    public static int findMatch(ArrayList<String> stringList, String itemMatch, int lowVal, int highVal) {
        int midVal = (lowVal + highVal)/2;
        int itemPos = (lowVal + highVal)/2;
        int rangeSize = (highVal - lowVal) + 1;

        if (itemMatch.equals(stringList.get(midVal))) {
            itemPos = midVal;
        } else if (rangeSize == 1) {
            itemPos = -1;
        } else {
            if (itemMatch.compareTo(stringList.get(midVal)) < 0) {
                itemPos = findMatch(stringList, itemMatch, lowVal, highVal);
            } else {
                itemPos = findMatch(stringList, itemMatch, midVal+1, highVal);
            }
        }

        return itemPos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> attendeesList = new ArrayList<String>();
        String attendeeName;
        int matchPos;

        attendeesList.add("Adams, Mary");
        attendeesList.add("Carver, Michael");
        attendeesList.add("Domer, Hugo");
        attendeesList.add("Fredericks, Carlos");
        attendeesList.add("Li, Jie");

        System.out.print("Enter person's name: Last, First: ");
        attendeeName = scan.nextLine();
        
        matchPos = findMatch(attendeesList, attendeeName, 0, attendeesList.size() - 1);
        if (matchPos >= 0) {
            System.out.println("Found at position " + matchPos + ".");
        }
        else {
            System.out.println("Not found.");
        }
    }
}
