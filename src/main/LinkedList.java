package src.main;

/**
 * Implementation of interface {@see List} as a singly linked-list of Objects,
 * using class {@see Node} as field;
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class LinkedList implements List {
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}

	public ReturnObject get(int index) {
		if(isEmpty()) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return wrap;
		} else if(index<0 || index>=size()) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return wrap;
		} else {
			Node nodeAtIndex = head;
			for(int i=0; i<index; i++) {
				nodeAtIndex = nodeAtIndex.getNext();
			}	
			ReturnObject wrap = new ReturnObjectImpl(nodeAtIndex.getValue());
			return wrap;	
		}
	}
	
	public ReturnObject remove(int index) {
		ReturnObject wrap = get(index);
		if(!wrap.hasError()) {
			size--;
			if(index==0) {
				if(size()==1) {
					head = null;
				} else {
					Node newHead = head.getNext();
					head = newHead;
				}
			} else {
				Node nodeBeforeIndex = head;
				for(int i=1; i<index; i++) {
					nodeBeforeIndex = nodeBeforeIndex.getNext();
				}
				nodeBeforeIndex.setNext(nodeBeforeIndex.getNext().getNext());
			}
		}
		return wrap;
	}
	
	public ReturnObject add(int index, Object item) {
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else if(index<0 || index>=size()) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return wrap;
		} else {
			size++;
			ReturnObject wrap = new ReturnObjectImpl(null);
			Node newNode = new Node(item);
			if(index==0) {
				newNode.setNext(head);
				head = newNode;
			} else {
				Node previous = head;
				for(int i=1; i<index; i++) {
					previous = previous.getNext();
				}
				newNode.setNext(previous.getNext());
				previous.setNext(newNode);
			}
			return wrap;	
		}					
	}
	
	public ReturnObject add(Object item) {
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			size++;
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
			Node newNode = new Node(item);
			if(isEmpty()) {
				head = newNode;
			} else {
				Node lastNode = head;
				while(lastNode.getNext()!=null) {
					lastNode = lastNode.getNext();
				}
				lastNode.setNext(newNode);
			}
			return wrap;
		}
	}

}
	
	