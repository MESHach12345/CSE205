import java.util.Scanner;
import java.util.ArrayList;

public class InBoth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.println("Enter number of Elements for the First List: ");
        int numOfElements = scan.nextInt();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            list1.add(scan.nextInt());
        }

        System.out.println("Enter number of Elements for the Second List: ");
        numOfElements = scan.nextInt();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            list2.add(scan.nextInt());
        }

        ArrayList<Integer> finalList = inBoth(list1, list2);

        System.out.println(finalList);

        scan.close();
    }

    public static ArrayList<Integer> inBoth(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    result.add(list1.get(i));
                }
            }
        }

        return result;
    }
}
