package src.main;

/**
 * Implementation of the Stack interface using AbstractStack as superclass.
 *
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class StackImpl extends AbstractStack {
    /**
     * Creates a new stack: this constructor does not check whether the provided list
     * is null.
     *  
     * @param list the internal data structure of the stack, passed to the superclass
     * and assigned to the protected field internalList.
     */
    public StackImpl(List list) {
        super(list);
    }
    /**
     * {@inheritDoc} 
     * 
     * Calls the isEmpty() method belonging to the implementation of {@see List} 
     * created with the constructor and assigned to the field internalList.
     */
    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }
    /**
     * {@inheritDoc}
     * 
     * Calls the size() method belonging to the implementation of {@see List} 
     * created with the constructor and assigned to the field internalList.
     */
    @Override
    public int size() {
        return internalList.size();
    }
    /**
     * {@inheritDoc}
     *  
     * The top of the stack is the end of internalList.
     * The method add(item) of the {@see List} implementation 
     * should already provide coverage for an attempt to add a null item to the stack.
     */
    @Override
    public void push(Object item) {
        internalList.add(item);
    }
    /**
     * {@inheritDoc}
     *  
     * The method get(index) of the {@see List} implementation
     * should already provide coverage for an attempt to access 
     * to a list with no elements or to an index out of bounds.
     *   
     * @return either the item peeked at the top of the stack or a {@see ErrorMessage}
     * wrapped in a {@see ReturnObjectImpl}
     */
    @Override
    public ReturnObject top() {
        return internalList.get(internalList.size()-1);
    }
    /**
     * {@inheritDoc} 
     * 
     * The method remove(index) of the {@see List} implementation 
     * should already provide coverage for an attempt to access
     * to an index out of bounds.
     *  
     * @return either the item popped out from the top of the stack or a {@see ErrorMessage}
     * wrapped in a {@see ReturnObjectImpl}
     */
    @Override
    public ReturnObject pop() {
        return internalList.remove(internalList.size()-1);
    }

}
