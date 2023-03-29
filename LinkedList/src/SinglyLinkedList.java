import java.util.LinkedList;

public class SinglyLinkedList {

	Node head;
	private int size;
	LinkedList ll;
	
	public SinglyLinkedList() {
		ll = new LinkedList(); 
		size = 0; 
		head = null;
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		/* to be completed by student */
		for(int i = 0; i < size; i++) {
			return ll[i].getData();
		}
	}
	
	
	public Node remove(int n) {
		/*to be completed by student */
		size -= 1;
		
		return (Node) ll.remove(n);
	}
	
	public void add(Node n) {
		/* to be completed by student */
		ll.add(n);
		size += 1;
	}
	
 
	
}