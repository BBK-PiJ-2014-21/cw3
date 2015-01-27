package src.main;
/**
 * Implementation of interface {@see Stack}.
 *
 * @author Federico Bartolomei (bbk-pij-2014-21)  
 */
public class StackImpl extends AbstractStack {
    /**
     * Creates a new stack: this constructor does not check whether the provided list
     * is null. If a null list is provided, a NullPointerException will be thrown at runtime
     * as soon as any operation is attempted on the underlying list {@see AbstractStack}.
     *  
     * @param list the internal data structure of the stack, passed to the superclass
     * and assigned to the protected field internalList.
     */
    public StackImpl(List list) {
        super(list);
    }
    /**
     * Calls the isEmpty() method belonging to the implementation of {@see List} 
     * created with the constructor and assigned to the field internalList. 
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return internalList.isEmpty();
    }
    /**
     * Calls the size() method belonging to the implementation of {@see List} 
     * created with the constructor and assigned to the field internalList.
     *  
     * @return the size of the stack.
     */
    public int size() {
        return internalList.size();
    }
    /**
     * The top of the stack is the end of internalList.
     * The method add(item) of the {@see List} implementation 
     * should already provide coverage for an attempt to add a null item to the stack.
     * 
     * @param item the new item to be pushed at the top of the stack.
     */
    public void push(Object item) {
        internalList.add(item);
    }
    /**
     * The method get(index) of the {@see List} implementation
     * should already provide coverage for an attempt to access 
     * to a list with no elements or to an index out of bounds.
     *   
     * @return either the item peeked at the top of the stack or a {@see ErrorMessage}
     * wrapped in a {@see ReturnObjectImpl}
     */
    public ReturnObject top() {
        return internalList.get(internalList.size()-1);
    }
    /**
     * The method remove(index) of the {@see List} implementation 
     * should already provide coverage for an attempt to access
     * to an index out of bounds.
     *  
     * @return either the item popped out from the top of the stack or a {@see ErrorMessage}
     * wrapped in a {@see ReturnObjectImpl}
     */
    public ReturnObject pop() {
        return internalList.remove(internalList.size()-1);
    }
    
}
