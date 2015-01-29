package src.main;

/**
 * Implementation of the FunctionalList interface using the singly linked-list {@see LinkedList} as superclass.
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	public FunctionalLinkedList() {
		super();
	}
    /**
     * {@inheritDoc}
     */
    @Override
	public ReturnObject head() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            FunctionalList funkLinkedList = new FunctionalLinkedList();
            funkLinkedList.add(get(0).getReturnValue());
            return funkLinkedList.get(0);
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public FunctionalList rest() {
		FunctionalList funkLinkedList = new FunctionalLinkedList();
        if(!isEmpty()) {
            for(int i=1; i<size(); i++) {
                funkLinkedList.add(get(i).getReturnValue());
            }
        }
		return funkLinkedList;
	}
	
}