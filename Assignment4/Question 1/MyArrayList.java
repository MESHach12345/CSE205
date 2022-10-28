import java.util.NoSuchElementException;

// Complete the implementation of your MyArrayList class in this file

public class MyArrayList implements MyList {
    // Implement the required fields and methods here

    private int currentCapacity = 8;
    private int size = 0;
    private Object[] storage = new Object[8];

    public void append(Object argument) {
        if (size == currentCapacity) {
            makeCapacity(2 * currentCapacity);
            storage[size] = argument;
        }
    }

    public void insertAt(int argument1, Object argument2) {
        if (argument1 < 0 || argument1 >= size) {
            throw new NoSuchElementException();
        } else {
            if (size == currentCapacity) {
                makeCapacity(2 * currentCapacity);
                for (int i = argument1; i < size; i++) {
                    Object temp = storage[i];
                    storage[i] = argument2;
                    storage[i + 1] = temp;
                }
            }
        }
    }

    public void removeAt(int argument) {
        if (argument < 0 || argument >= size) {
            throw new NoSuchElementException();
        } else {
            for (int i = argument; i >= 0; i--) {
                Object temp = storage[i + 1];
                storage[i] = temp;
            }
        }
    }

    public Object getAt(int argument) {
        if (argument < 0 || argument >= size) {
            throw new NoSuchElementException();
        } else {
            return storage[argument];
        }
    }

    public int getSize() {
        return size;
    }

    public void makeCapacity(int minCapacity) {
        if (minCapacity < size || minCapacity == currentCapacity) {
            ;
        } else {
            if (8 > minCapacity) {
                currentCapacity = 8;
            } else {
                currentCapacity = minCapacity;
            }

            Object[] newArray = new Object[currentCapacity];

            for (int i = 0; i < currentCapacity; i++) {
                newArray[i] = storage[i];
            }

            storage = newArray;
        }
    }

    public void trimExcess() {
        makeCapacity(size);
    }

    // Do not alter the code below
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }
}