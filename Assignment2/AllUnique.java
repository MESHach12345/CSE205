import java.util.Scanner;
import java.util.ArrayList;

public class AllUnique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter number of Elements: ");
        int numOfElements = scan.nextInt();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            list.add(scan.nextInt());
        }

        ArrayList<Integer> finalList = allUnique(list);

        System.out.println(finalList);

        scan.close();
    }

    public static ArrayList<Integer> allUnique(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }

            if (count==1) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}