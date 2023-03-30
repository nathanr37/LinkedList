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

	Node get(int index) { // get value (must add .getData() )

		Node n = head;

		if (index > size) {
			return null;
		} else {

			for (int i = 0; i < index; i++) {
				n = n.next;
			}

			return n;
		}

	}

	public String toString() {
		/* to be completed by student */
		String result = "";
		Node n = head;

		while (n != null) {
			result += n.getData() + " ";
			n = n.next;
		}

		return result;
	}

	public Node remove(int target) {
		/* to be completed by student */

		Node n = head;
		Node temp;
		Node remove;

		if(target > size) {
			return null;
		} else if (target == 0) {
			head = n.next;
			size -= 1;
			return n;

		} else if (target == size) {
			for (int i = 0; i <= target - 1; i++) {
				n=n.next;
			}
			size -= 1;
			remove = n.next;
			n.next = null;

			return remove;

		} else {

			for (int i = 1; i < target; i++) {
				n = n.next;
			}

			// set temp = to 2 nodes later
			temp = n.next;
			remove = n.next; // this n.next is the node you remove
			temp = temp.next;

			// set n.next = to the node after skip
			n.next = temp;
			size -= 1;

			// return the value you removed
			return remove;
		}
	}

	public void add(Node n) {
		/* to be completed by student */
		if (tail == null) {
			head = tail = n;
		} else {
			tail.next = n;
			tail = n;
		}

		tail.next = null;

		size += 1;
	}

}