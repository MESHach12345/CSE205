import java.util.NoSuchElementException;
// Complete the implementation of your MyLinkedList class in this file
public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
   private int size;
   private Node head;
   public void append(Object items) {
      Node newNode = new Node(); 
      newNode.data = items;
      Node currentNode = head;
      if (size == 0)
         head = newNode;
      else {
         for (int i = 0; i < size - 1; i++) {
            currentNode = currentNode.next;
         }
         currentNode.next = newNode;
      }
      size++; 
   } public void removeAt(int ind) {
      Node currentNode = head;
      if (ind < 0 || ind >= size) {
         throw new NoSuchElementException();
      } else {
         if (ind==0)
            head = head.next;
         else {
            for (int i = 0; i < ind - 1; i++) {
               currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
         }
      }
      size--;
   }public void insertAt(int ind, Object items) {
      Node newNode = new Node(); 
      newNode.data = items; 
      Node currentNode = head;
      if (ind < 0 || ind > size) {
         throw new NoSuchElementException();
      } else if (ind == 0) {
         newNode.data = items;
         newNode.next = head;
         head = newNode;
      } else {
         if (ind == size) {
            append(items);
         }
         else {
            for (int i = 0; i < ind-1; i++) {
               currentNode = currentNode.next;
            }
         }
         newNode.next = currentNode.next;
         currentNode.next = newNode;
      }
      size++;
   }
   public int getSize() {
      return size;
   }
public Object getAt(int ind) {
      Node presentNode = head;
      if (ind < 0 || ind >= size) {
         throw new NoSuchElementException();
      } 
      else {
         for (int i = 0; i < ind; i++) {
            presentNode = presentNode.next;
         }
         return presentNode.data;
      }
   }
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;
	public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}
	public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}	class Node {
		public Object data = null;
		public Node next = null;
	}
}