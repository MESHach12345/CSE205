package Assignment7.MyQuickSort;

// Complete the implementation of your MyArrayList class in this file
import java.util.NoSuchElementException;

public class MyArrayList implements MyList {
    
   private int currentCapacity = 8;
   private int size = 0;
   private Object[] storage = new Object[currentCapacity];
      public void trimExcess() {
      makeCapacity(size);
   }
   
   public void append(Object item) {
      // doubling the capacity and adding the new item at the end
      if (size == currentCapacity) {
         makeCapacity(currentCapacity * 2);
      }
      storage[size] = item;
      size++;
   }
   
   public void insertAt(int ind, Object item) {
      // inserting a new item at the specified index, and throwing an exception if not possible
      if (ind > size || ind < 0) {
         throw new NoSuchElementException();
      } else {
         if (size == currentCapacity)
            makeCapacity(currentCapacity * 2);      
         if (size > 0) {
            for (int i = size; i > ind ; i--) {
               storage[i] = storage[i - 1];
            }
            size++;
         } else
            append(item);
         storage[ind] = item;
      }
   }
   
   public void removeAt(int ind) {
      // removing item at a specified index from the ArrayList
      if (ind >= size || ind < 0) {
         throw new NoSuchElementException();
      } else {
         if (size == currentCapacity){
            makeCapacity(currentCapacity * 2);
         }
         for (int i = ind; i < size; i++){
            storage[i] = storage[i + 1];
         }
         size--;
      }
   }
   
   public Object getAt(int ind) {
      // returning an item at the specified index
      if (ind >= size || ind < 0) {
         throw new NoSuchElementException();
      } else {
         return storage[ind];
      }
   }
   
   public int getSize() {
	   // returing the size
	   return size;
	}
   
   // method to change the capacity of the ArrayList
   public void makeCapacity(int minCapacity) {
      if (minCapacity > size || minCapacity != currentCapacity) {
         if (minCapacity > 8)
            currentCapacity= minCapacity;
         else
            currentCapacity = 8;
         // declaring a temporary storage to copy elements to and from
         Object[] tempStorage = new Object[currentCapacity];
         for (int i = 0; i < size; i++) {
            tempStorage[i] = storage[i];
         }
         storage = tempStorage;
      }
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
