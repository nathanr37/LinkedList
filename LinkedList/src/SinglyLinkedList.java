import java.util.LinkedList;

public class SinglyLinkedList {

	Node head;
	Node tail;
	private int size;
	
	
	public SinglyLinkedList() {
		size = 0; 
		head = null;
		tail = null;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		/* to be completed by student */
		String result = "";
		Node n = head;
		
		while(n != null) {
			result += n.getData() + " ";
			n = n.next;
		}
		
		return result;
		
	}
	
	
//	public Node remove(int n) {
//		/*to be completed by student */
//		
//		
//		
//		
//		
//		size -= 1;
//	
//	}
	
	public void add(Node n) {
		/* to be completed by student */
		if(tail == null) {
			head = tail = n;
		}else {
			tail.next = n;
			tail = n;
		}
		
		tail.next = null;
		
		size += 1;
	}
	
 
	
}