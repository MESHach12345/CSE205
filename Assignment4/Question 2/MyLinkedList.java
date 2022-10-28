// Complete the implementation of your MyLinkedList class in this file


public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
    
    private Node head = null;
	private int size = 0;

	public void append(Object item){
        Node newNode = new Node();
        newNode.data = item;
        if(size == 0){
            head = newNode;
        }else if(size == 1){
            head.next = newNode;
        }
        else if(size >= 2){
            Node travel = head;
            for(int i = 1; i < size; i++){
              travel = travel.next;
            }
            travel = newNode;
        }
        size++;
	}
		
	public void insertAt(int argument1, Object argument2) {

	}

	public void removeAt(int argument) {
		
	}

	public Object getAt(int argument) {
		return ;
	}

	public int getSize() {
		return ;
	}
   
	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}
}