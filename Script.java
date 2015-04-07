package Day7;

public class Script {
	
	public static void main (String [] args ) {
		
		int [] array = {4,6,2,45,7,3,5,3,1,4,6,21,4,6,2,4,6,2,4,6,2,111,34,13};
		
		ListUtilities list = ListUtilities.arrayToLinkedList(array);
		
		list.printElements();
	}

}
