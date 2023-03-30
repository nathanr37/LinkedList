import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test() {
		SinglyLinkedList temp = new SinglyLinkedList();


		temp.add(new Node(1));
		temp.add(new Node(3));
		temp.add(new Node(2));
		temp.add(new Node(5));
		temp.add(new Node(5));
		temp.add(new Node(4));
		
		
		
		System.out.println("Original: " + temp.toString());
		
		System.out.println("Removed: " + temp.remove(0).getData());
		System.out.println("Size: " + temp.size());
		System.out.println("New: " + temp.toString());	
		
		System.out.println(" ");
		
		System.out.println("Check index 1: " + temp.get(1).getData());
		System.out.println("Check index 3: " + temp.get(3).getData());
		System.out.println("Check index 5: " + temp.get(5).getData());
		
		System.out.println("Removed: " + temp.remove(5).getData());
		
		System.out.println("New: " + temp.toString());	
		
		System.out.println("Size: " + temp.size());
		
	
		
	}

}
