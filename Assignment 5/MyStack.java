import java.util.NoSuchElementException;

public class MyStack implements IStack {
	Object[] stack = new Object[0];
    int size = 0;
    // Object[] newStack = new Object[size + 1];
    Object[] newStack = new Object[size];

	@Override
	public void push(Object item) {
        
        // Object[] newStack = new Object[size+1];
        // newStack[0] = item;
        // for (int i = 0; i < size; i++){
        //     newStack[i+1] = stack[i];
        // }
        // size++;

        // Object[] stack = new Object[size];
        // for (int i = 0; i < size; i++){
        //     stack[i] = newStack[i];
        // }

        size = size + 1;
        Object[] newStack = new Object[size];
        newStack[0] = item;
        for (int i = 1; i < size; i++) {
            newStack[i] = stack[i-1];
        }

        Object[] stack = new Object[size];
        for (int i = 0; i < size; i++) {
            stack[i] = newStack[i];
            System.out.println(stack[i]);
        }

        System.out.println(size);
	}

	@Override
	public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            size = size - 1;
            // Object[] stack1 = new Object[size];
            // Object firstItem = stack[0];
            // for (int i = 1; i < size; i++) {
            //     stack1[i-1] = stack[i];
            // }

            // Object[] stack = new Object[size];
            // for (int i = 0; i < size; i++){
            //     // stack[i] = newStack[i];
            // }

            // return firstItem;
            Object firstItem = stack[0];
            Object[] newStack = new Object[size];
            for (int i = 1; i < size; i++) {
                newStack[i] = stack[i+1];
            }

            Object[] stack = new Object[size];
            for (int i = 0; i < size; i++) {
                stack[i] = newStack[i];
            }

            return firstItem;
        }
	}

	@Override
	public Object peek() {
        
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            Object firstItem = stack[0];
            
            return firstItem;
        }
	}

	@Override
	public int indexOf(Object item) {
        
        int index = -50;
        
        for (int i = 0; i < size; i++) {
            if (stack[i] == item) {
                index = i;
                break;
            } else {
                continue;
            }
        }

        if (index<0) {
            return -1;
        } else {
            return index;
        }
	}

	@Override
	public int getSize() {
        return size;
	}

	@Override
	public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
	}

	// add any necessary methods or classes below
}
