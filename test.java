public class Test {

    static int foo(int n) {
        int x = 0;
  
        while (n >= 0) {
            n--;
            x += n;
        }
        
        return x;
    }

    public static void main(String[] args) {
        int n = 5;

        foo(n);
    }
}