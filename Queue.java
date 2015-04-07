package Day7;

public class Queue {

	public Request firstInQueue;
	
    public Queue () {
    	firstInQueue=null;
    }
	
	public void insert (Request req) { 
		
		if (firstInQueue == null) {
			firstInQueue = req;
		} else {
		
		Request current = firstInQueue;
		
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(req);
		}
	}
	
	public boolean retrieve () {
	
		if (firstInQueue == null) {
			return false;
		} else {
			firstInQueue = firstInQueue.getNext();
			return true;
		}
 	}
	
	public int size () {
		
		int count = 1;
		
		if (firstInQueue == null) {
			return 0;
		} else {
		
			Request current = firstInQueue;
		
			while (current.getNext() != null) {
				count++;
				current = current.getNext();
			}
		
			return count;
		}
	}
	
}
