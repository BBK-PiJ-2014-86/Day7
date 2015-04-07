package Day7;

public class Request {

	int requestId;
	Request next;
	
	public Request (int n) {
		requestId = n;
		next = null;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int number) {
		this.requestId = number;
	}

	public Request getNext() {
		return next;
	}

	public void setNext(Request next) {
		this.next = next;
	}
	
	
	
}
