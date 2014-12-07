package day7;

public class QueueScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue  queue = new Queue ();
		
		System.out.println("There are "+ queue.size()+ " requests in the queue.");
		System.out.println("Inserting request 5...");
		queue.insert(new Request (5));
		System.out.println("Inserting request 8...");
		queue.insert(new Request (8));
		System.out.println("Inserting request 12...");
		queue.insert(new Request (12));
		
		System.out.println("There are "+ queue.size()+ " requests in the queue.");
		
		System.out.println("Retrieving request 5... done");
		
		queue.retrieve();
		System.out.println("Inserting request 12...");
		queue.insert(new Request (13));
		System.out.println("There are "+ queue.size()+ " requests in the queue.");
		
		System.out.println("Retrieving request 8... done");
		queue.retrieve();
		System.out.println("Retrieving request 12... done");
		queue.retrieve();
		System.out.println("There are "+ queue.size()+ " requests in the queue.");
		System.out.println("Retrieving request 13... done");
		queue.retrieve();
	}

}
