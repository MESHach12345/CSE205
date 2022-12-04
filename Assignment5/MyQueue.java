import java.util.NoSuchElementException;

public class MyQueue implements IQueue {
	// add any necessary variables here
   Node head = new Node();
   Node tail = new Node();
   int size = 0;
   
	@Override
	public void enqueue(Object item) {
      Node temp = new Node();
      temp.data = item;
      tail.next = temp;
      tail = temp;
      
      if(size == 0)
         head = temp;
      
      size++;
	}

	@Override
	public Object dequeue() {
      if(this.isEmpty())
         throw new NoSuchElementException();
      else{
         Object temp = head.data;
         head = head.next;
         size--;
         return temp;
      }
	}

	@Override
	public Object peek() {
      if(this.isEmpty())
         throw new NoSuchElementException();
      else
         return head.data;
	}

	@Override
	public int indexOf(Object item) {
      Node cur = new Node();
	   cur = head;
	   int i = -1;
      while((cur.data != item) && cur.next != null){
         cur = cur.next;  
         i++;
      }
      if(cur.data == item)
         return i+1;
      else
       return -1;
	}

	@Override
	public int getSize() {
      return size;
	}

	@Override
	public boolean isEmpty() {
      if(size == 0)
         return true;
      else
         return false;
	}

	// add any necessary methods or classes below
	private class Node {
		public Object data = null;
		public Node next = null;
	}

}