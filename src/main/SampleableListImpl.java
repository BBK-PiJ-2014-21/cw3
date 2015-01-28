package src.main;

/**
 * Implementation of interface {@see SampleableList}
 * All the methods from interface {@list} are overridden,
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
     * 
     * @param list the list underlying this implementation
     */
	public SampleableListImpl(List list) {
		this.list = list;
	}
	
	public SampleableList sample() {
		SampleableList s = new SampleableListImpl(list);
		for(int i=1; i<s.size(); i++) {
			s.remove(i);
		}
		return s;
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public int size() {
		return list.size();
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject get(int index) {
		return list.get(index);
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject remove(int index) {
		return list.remove(index);
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
    @Override
	public ReturnObject add(int index, Object item) {
		return list.add(index, item);
	}
    /**
     * Method from interface {@see List} calls the implementation
     * provided by the list set up with the constructor
     */
	@Override
	public ReturnObject add(Object item) {
		return list.add(item);
	}
	
}