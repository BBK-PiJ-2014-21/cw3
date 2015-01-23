/**
 * Implementation of interface {@see FunctionalList} which extends the singly linked-list {@see LinkedList}
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	public FunctionalLinkedList() {
		super();
	}
	
	public ReturnObject head() {
		return get(0);
	}
	
	public FunctionalList rest() {
		FunctionalList funkList = new FunctionalLinkedList();
        if(!isEmpty()) {
            for(int i=0; i<size(); i++) {
                funkList.add(get(i).getReturnValue());
            }
            funkList.remove(0);
        }
		return funkList; 
	}
	
}