package day7;

public class ListUtilities {

	private Node head = null;
	
	public Node getHead () {
		return head;
	}
	
	public static ListUtilities arrayToLinkedList (int [] array ) {
		
		ListUtilities lu = new ListUtilities();
		
		for (int i =0; i<array.length; i++) {
		
		lu.add(new Node(array[i]));
		
		}
		
		return lu;
		
	}	
	
	public void add (Node node) {
		
		Node current = null;
		current = head;
	
		/*
		 * 
		 * This does automatic sorting
		 * 
		 if (head == null) {
			head=node;
		} else if (head.number>node.number) {
		
			Node tempN = head;
			head = node;
			head.next = tempN;
		
		} else {
			while (current.next != null) {

				if (node.number<current.next.number) {
				
				 	node.next = current.next;
				 	current.next = node;
				 	break;
				} else {
					
					current = current.next;
				}
			}
			current.next = node;	
		}
	
	*/
		
		
		if (head == null) {
			head=node;
		} else  {
			while (current.next != null) {
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
	
	public int getSize () {
		int size = 1;
		Node current = head;
		
		if (head == null) {
			return 0;
		} else {
			while (current.next != null) {
				size ++;
				current = current.next;				
			}
			return size;
		}
		
	}
	
	public static void bubbleSort (ListUtilities list) {
		
		Node current = list.head;
		
		for (int i = 0; i<list.getSize(); i++) {
			if(current.number>current.next.number) {
				int temp;
				temp = current.number;
				current.number = current.next.number;
				current.next.number = temp;
			}
			current = current.next;
			
			if (current.next == null) break;
		}

	}
	
	
}
