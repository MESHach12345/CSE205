class Foo {
    public int i = 68;

    public Foo(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Foo x = new Foo(52);
        Foo y = new Foo(50);
        x.i = y.i;
        y.i=54;
        System.out.println(x.i);
    }
}