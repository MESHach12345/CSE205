public class Quiz {
    
    public static int foo(int n) {
        int x = 0;

	while (n >= 0) {
		x += n;
		n--;
	}

	return x;
    }
    
    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
