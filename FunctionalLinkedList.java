
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	public FunctionalLinkedList() {
		super();
	}
	
	public ReturnObject head() {
		return get(0);
	}
	
	public FunctionalList rest() {
		FunctionalList funkList = this;
		funkList.remove(0);
		return funkList; 
	}
	
}