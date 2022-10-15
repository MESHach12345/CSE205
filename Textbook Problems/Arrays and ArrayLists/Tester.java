// Challenge Problem 6.3.1 Main Program

public class Tester
{
    public static void main(String[] args)
    {
        int [] factors1 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Input: { 1, 2, 3, 4, 5 }");
        System.out.println(Numbers.multiply(factors1));

        int [] factors2 = { 1, 2, 0, 4 };
        System.out.println("\nInput: { 1, 2, 0, 4 }");
        System.out.println(Numbers.multiply(factors2));

        int [] factors3 = { 42 };
        System.out.println("\nInput: { 42 }");
        System.out.println(Numbers.multiply(factors3));

        int [] factors4 = { -1, -2, -4, -8, -16 };
        System.out.println("\nInput: { -1, -2, -4, -8, -16 }");
        System.out.println(Numbers.multiply(factors4));
    }

}