package Assignment6;

public class MyBSTree<T extends Comparable <T>> implements ITree<T> {

    @Override
    public void insert(T item) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean containsItem(T item) {
        return false;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void printInOrder() {
        // TODO Auto-generated method stub 
    }

    public MyBSTree(T item) {

    }

    class Node{
        public T data;
        public Node left;
        public Node right;

        public Node(T arg) {
            data = arg;
        }

        public void insert(T item) {
            
        }
    }
}