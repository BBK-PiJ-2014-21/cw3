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
     * Create a new SampleableListImpl with a {@see ArrayList} as internal data structure filled with 
     * a copy of the elements of the provided list (the original list is not affected by changes on the new list).
     * This constructor does not check whether the provided list is null: if a null list is provided, 
     * a NullPointerException will be thrown at runtime as soon as any operation is attempted on the underlying list.
     * 
     * @param list the list underlying this implementation
     */
	public SampleableListImpl(List list) {
		ArrayList internal = new ArrayList();
        for(int i=0; i<list.size(); i++) {
            internal.add(list.get(i).getReturnValue());
        }
        this.list = internal;
	}
    /**
     * An empty SampleableListImpl can be created with this constructor which takes no parameters:
     * the internal data structure will be an empty {@see LinkedList}.
     *
     */
    public SampleableListImpl() {
        LinkedList internal = new LinkedList();
        this.list = internal;
    }
    /**
     * {@inheritDoc}
     *
     * @return a SampleableList containing the first (at index 0), third, fifth... element,
     * or empty if the caller List is empty. The internal data structure of the new List
     * will be the same implementation used in the caller class.
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