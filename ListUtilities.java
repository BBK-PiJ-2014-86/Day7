package day7;

public class ListUtilities {

	private Node head = null;
	
	public static ListUtilities arrayToLinkedList (int [] array ) {
		
		ListUtilities lu = new ListUtilities();
		
		for (int i =0; i<array.length; i++) {
		
		lu.add(new Node(array[i]));
		
		}
		
		return lu;
		
	}	
	
	public void add (Node node) {
		
		if (head == null) {
			head=node;
		} else {
		Node current = head;
		
		while (current.next!=null) {
			current = current.next;
		}
		current.next = node;
		}
	}
	
	public void printElements () {
		
		Node current = head;
		
		while (current.next != null) {
			System.out.print(" " + current.number + " ");
			current = current.next;
		}
		
		System.out.print(" " + current.number + " ");
		
	}
	
	
}
