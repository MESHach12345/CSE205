import java.util.Scanner;
import java.util.ArrayList;

public class InRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> aList = new ArrayList<Integer>();

        System.out.println("Enter number of elements: ");
        int numOfElements = scan.nextInt();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            aList.add(scan.nextInt());
        }

        System.out.println("Enter minimum value in aList: ");
        int min = scan.nextInt();

        System.out.println("Enter maximum value in aList: ");
        int max = scan.nextInt();

        ArrayList<Integer> finalList = inRange(aList, min, max);

        System.out.println(finalList);

        scan.close();
    }

    public static ArrayList<Integer> inRange(ArrayList<Integer> list, int a, int b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= a && list.get(i) <= b) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
