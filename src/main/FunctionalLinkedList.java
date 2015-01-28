package src.main;

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
        if (isEmpty()) {
            ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
            return wrap;
        } else {
            FunctionalList funkList = new FunctionalLinkedList();
            funkList.add(get(0).getReturnValue());
            ReturnObject wrap = funkList.get(0);
            return wrap;
        }
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