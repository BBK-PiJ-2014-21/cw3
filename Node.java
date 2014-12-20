// Node class to be used for LinkedLists

public class Node {
	private Object value;
	private Node next;
	
	public Node(Object value) {
		this.value = value;
		next = null;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
		
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Object value) {
		next = new Node(value);
	}

}
	
	
	
	