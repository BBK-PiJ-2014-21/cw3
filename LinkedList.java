
public class LinkedList implements List {
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		int size = 0;
		if(!isEmpty()) {
			Node aux = head;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
				size++;
			}
		}
		return size;
	}
	
	public ReturnObject get(int index) {	// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject remove(int index) {	// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject add(int index, Object item) {	// TO BE IMPLEMENTED
		return null;
	}
	
	public ReturnObject add(Object item) {	// TO BE IMPLEMENTED
		return null;
	}

}
	
	