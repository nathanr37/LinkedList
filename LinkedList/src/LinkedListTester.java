import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test() {
		
		SinglyLinkedList temp = new SinglyLinkedList();
		
		Node a = new Node(1);
		
		temp.add(a);
	
		
	
		
		
		
		assertEquals(2, temp.remove(0));
		
	}

}
