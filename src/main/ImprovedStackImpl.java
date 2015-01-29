package src.main;

/**
 * Implementation of the ImprovedStack interface. It's dependant on the {@see StackImpl} implementation
 * as a field to inherit the methods from {@see Stack}, which itself use a {@see List} as the 
 * underlying data structure to store the elements in the stack. 
 * 
 * @author federico bartolomei (bbk-pij-2014-21)
 */
public class ImprovedStackImpl implements ImprovedStack {
    private StackImpl stack;
    /**
     * The constructor take an implementation of interface {@see List} as a parameter
     * passing it down to initialize the field stack.
     * 
     * @param list the data structure behind the stack.
     */
    public ImprovedStackImpl(List list) {
        stack = new StackImpl(list);
    }
    /**
     * If no parameter is passed with the constructor, an empty stack will be created
     * with an empty {@see LinkedList} as underlying data structure.
     *   
     */
    public ImprovedStackImpl() {
        List emptyList = new LinkedList();
        stack = new StackImpl(emptyList);
    }
    /**
     * {@inheritDoc}
     * 
     * This method copies the internalList elements if the caller class on reverse order
     * into a {@see LinkedListImpl}.
     *
     * @return a new ImprovedStack with a LinkedList as internal data structure, either empty
     * (if the original ImprovedStack was empty) or with its elements on reverse order.
     */
    @Override
    public ImprovedStack reverse() {
        List copy = new LinkedList();
        if(!stack.isEmpty()) {
            for(int i = stack.internalList.size() - 1; i >= 0; i--) {
                copy.add(stack.internalList.get(i).getReturnValue());
            }
        }
        ImprovedStack reversed = new ImprovedStackImpl(copy);
        return reversed;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Object object) {
    }
    /**
     * {@inheritDoc}
     *
     * Method from interface {@see Stack} return the method from the implementation {@see StackImpl}
     * which itself calls the method implemented by the list set up with the constructor.
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
     /**
     * {@inheritDoc}
     *
     * Method from interface {@see Stack} return the method from the implementation {@see StackImpl}
     * which itself calls the method implemented by the list set up with the constructor.
     */
    @Override
    public int size() {
        return stack.size();
    }
    /**
     * {@inheritDoc}
     *
     * Method from interface {@see Stack} return the method from the implementation {@see StackImpl}
     * which itself calls the method implemented by the list set up with the constructor.
     */
    @Override
    public void push(Object item) {
        stack.push(item);
    }
    /**
     * {@inheritDoc}
     *
     * Method from interface {@see Stack} return the method from the implementation {@see StackImpl}
     * which itself calls the method implemented by the list set up with the constructor.
     */
    @Override
    public ReturnObject top() {
        return stack.top();
    }
    /**
     * {@inheritDoc}
     *
     * Method from interface {@see Stack} return the method from the implementation {@see StackImpl}
     * which itself calls the method implemented by the list set up with the constructor.
     */
    public ReturnObject pop() {
        return stack.pop();
    }
    
}
