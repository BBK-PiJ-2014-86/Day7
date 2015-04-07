package Day7;

public class Stack {

	Request bottom;
	
	
	public Stack () {
		bottom =null;
	}
	
	
	public void push (Request req) {
		
		Request temp = bottom;
		
		if (bottom == null) {
			bottom = req;
		} else {
			
			while (temp.getNext()!=null) {
				temp = temp.getNext();
			}
			
			temp.setNext(req);
			
		}
			
	}
	
	public boolean pop () {
		
		Request temp = bottom;
		
		if (isEmpty()) {
			System.out.println("The Stack is empty");
			return false;
		} else if (temp.getNext() == null){ 
			
			System.out.println("Popping... it�s a "+bottom.getRequestId());
			bottom =null;
			return true;
			
		}else {
			
			while ((temp.getNext().getNext()!= null)) {
				temp = temp.getNext();
			}
			
			System.out.println("Popping... it�s a "+temp.getNext().getRequestId());
			temp.setNext(null);
			return true;
			
		}

	}



	
	
	public boolean isEmpty () {
		
		if (bottom == null) {
			return true;
		} else {
			return false;
		}
	}
}
