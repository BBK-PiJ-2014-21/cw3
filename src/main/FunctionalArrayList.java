package src.main;

/**
 * Implementation of the FunctionalList interface using the array list {@see ArrayList} as superclass.
 * 
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	public FunctionalArrayList() {
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
            FunctionalList funkArrayList = new FunctionalArrayList();
            funkArrayList.add(get(0).getReturnValue());
            return funkArrayList.get(0);
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public FunctionalList rest() {
		FunctionalList funkArrayList = new FunctionalArrayList();
		if(!isEmpty()) {
			for(int i=1; i<size(); i++) {
                funkArrayList.add(get(i).getReturnValue());
			}
		}
		return funkArrayList;
	}
	
}
		