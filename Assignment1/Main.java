public class Main {
    public static void main(String[] agrs) {
        // you may write code in this main method to test your required method
        int x = 10;
        int y = 9;
        int z = 8;

        int diff = DiffMinMax3(x,y,z);
        System.out.println(diff);
    }

    // define your required method here below
    public static int DiffMinMax3(int a, int b, int c) {
        int max = a;
        int min = a;

        int diff = 0;

        if(a<b) {
            if (b<c) {
                max = c;
                min = a;
            } else {
                max = b;
                if (a<c) {
                    min = a;
                }
            }
        } else {
            if (a<c) {
                max = c;
                min = b;
            } else {
                max = a;
                if (b<c) {
                    min = b;
                }
            }
        }

        diff = max - min;

        return diff;
    }
 }
 