package src.main;

/**
 * Node class created for {@see LinkedList} implementation of {@see List} interface,
 * with standard getters and setters.
 *
 * @author fbarto01 (bbk-pij-2014-21) 
 */
public class Node {
	private Object value;
	private Node next;
	/**
	 * @param value the Object which the Node contains.
	 */
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
		return next;
	}
	
	public void setNext(Node newNode) {
		next = newNode;
	}

}
	
	
	
	