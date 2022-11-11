package Recursion;
import java.util.Scanner;

public class BinarySearch {
    public static void guessNumber(int lowValue, int highValue, Scanner scan) {
        int midValue = (lowValue + highValue)/2;
        char userAnswer;

        System.out.println("Is it " + midValue + "? (l/h/y)");
        userAnswer = scan.next().charAt(0);

        if (userAnswer == 'y') {
            System.out.println("Thank You!!");
        } else if (userAnswer == 'l') {
            guessNumber(lowValue, midValue, scan);
        } else {
            guessNumber(midValue+1, highValue, scan);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Answer with:");
        System.out.println("   l (your num is lower)");
        System.out.println("   h (your num is higher)");
        System.out.println("   any other key (guess is right).");

        guessNumber(0, 100, scanner);
    }
}