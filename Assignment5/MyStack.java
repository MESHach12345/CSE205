import java.util.NoSuchElementException;

public class MyStack implements IStack {
	// add any necessary variables here
	Node head = new Node();
   int size = 0;
	@Override
	public void push(Object item) {
      if(head.data == null)
         head.data = item;
      else{
         Node temp = new Node();
         temp.next = head;
         temp.data = item;
         head = temp;
      }
      size++;
	}

	@Override
	public Object pop() {
	   if(this.isEmpty()){
	      throw new NoSuchElementException();
	   }
	   else{
      Object temp = head.data;
      head = head.next;
      size--;
      return temp;
	   }
	}

	@Override
	public Object peek() {
	   if(head.data != null)
         return head.data;
      else{
         throw new NoSuchElementException();
      }
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
      if(head == null || head.data == null){
         return true;
      }
      else{
         return false;
      }
	}

	// add any necessary methods or classes below
	private class Node {
		public Object data = null;
		public Node next = null;
	}
}