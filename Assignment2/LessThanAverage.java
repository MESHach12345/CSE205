import java.util.ArrayList;
import java.util.Scanner;

public class LessThanAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();

        System.out.println("Enter number of Elements: ");
        int numOfElements = scan.nextInt();

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter element: ");
            input.add(scan.nextInt());
        }

        ArrayList<Integer> output = lessThanAverage(input);

        System.out.println(output);

        scan.close();
    }

    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> list) {
        int sum = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        double avg = sum / list.size();

        for (int i = 0; i < list.size(); i++) {
            if (avg > list.get(i)) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}