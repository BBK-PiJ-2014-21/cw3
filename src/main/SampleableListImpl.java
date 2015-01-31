package src.main;

/**
 * Implementation of the SampleableList interface.
 * All the methods from interface {@see List} are overridden,
 * using the implementations of the underlying list provided
 * with the constructor. 
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class SampleableListImpl implements SampleableList {
	private List list;
    /**
     * Create a new SampleableListImpl with the provided list
     * as the underlying data structure. 
     * This constructor does not check whether the provided list
     * is null: if a null list is provided, a NullPointerException 
     * will be thrown at runtime as soon as any operation is attempted on the underlying list.
     * 
     * @param list the list underlying this implementation
     */
	public SampleableListImpl(List list) {
		this.list = list;
	}
    /**
     * {@inheritDoc}
     */
    @Override
	public SampleableList sample() {
		SampleableList s = new SampleableListImpl(list);
		for(int i=1; i<s.size(); i++) {
			s.remove(i);
		}
		return s;
	}
    /**
     * {@inheritDoc}
     *  
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
    /**
     * {@inheritDoc}
     *  
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public int size() {
		return list.size();
	}
    /**
     * {@inheritDoc}
     *  
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject get(int index) {
		return list.get(index);
	}
    /**
     * {@inheritDoc}
     *  
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject remove(int index) {
		return list.remove(index);
	}
    /**
     * {@inheritDoc}
     *  
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject add(int index, Object item) {
		return list.add(index, item);
	}
    /**
     * {@inheritDoc}
     *
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
    public ReturnObject add(Object item) {
        return list.add(item);
    }
	
}