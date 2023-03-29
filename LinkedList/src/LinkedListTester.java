import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test() {
		SinglyLinkedList temp = new SinglyLinkedList();


		temp.add(new Node(1));
		temp.add(new Node(2));
		temp.add(new Node(3));
		temp.add(new Node(4));
		
	
		
		System.out.println(temp.toString());
		
	
		
	}

}
