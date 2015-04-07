package Day7;

public class StackScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		System.out.println("Pushing 5...");
		stack.push(new Request(5));
		
		System.out.println("Pushing 8...");
		stack.push(new Request(8));
		
		System.out.println("Pushing 12...");
		stack.push(new Request(12));
       
		stack.pop();
        
		System.out.println("Pushing 13...");
		stack.push(new Request(13));

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("Pushing 5...");
		stack.push(new Request(5));
		System.out.println("Pushing 5...");
		stack.push(new Request(5));
		
	
		
	}

}
