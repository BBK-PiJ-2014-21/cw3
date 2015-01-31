import org.junit.Test;
import src.main.*;

import static org.junit.Assert.*;

/**
 * JUnit tests for {@see StackImpl} and {@see ImprovedStackImpl} implementations.
 * The implementations of most methods are calling the methods of the stack's internal data structure,
 * which is already tested successfully in the more extensive {@see TestList}.
 *
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public class TestStack {
    /**
     * Method which creates a new LinkedList with four elements in it, to be used in various tests and avoid
     * code repetition.
     * 
     * @return a {@see LinkedList} with four elements in it. 
     */
    public LinkedList createLinkedList() {
        LinkedList toReturn = new LinkedList();
        toReturn.add("StringAtIndex0");
        toReturn.add(1);
        toReturn.add(3.33);
        toReturn.add("OrginalTop");
        return toReturn;
    }
    
    @Test
    public void testEmptyStackIsEmpty() {
        ArrayList empty = new ArrayList();
        Stack stack = new StackImpl(empty);
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testEmptyStackTop() {
        ArrayList empty = new ArrayList();
        Stack stack = new StackImpl(empty);
        assertEquals("Should return an EMPTY_STRUCTURE ReturnObject", stack.top().getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void testPopMoreThanAllElementsCheckSize() {
        StackImpl stoker = new StackImpl(createLinkedList());
        stoker.pop();
        stoker.pop();
        stoker.pop();
        stoker.pop();
        stoker.pop();
        stoker.pop();
        assertEquals("Size should be 0", stoker.size(), 0);
    }
    
    @Test
    public void testOriginalListIsAffectedFromChangesToStack() {
        LinkedList original = createLinkedList();
        Stack newStack = new StackImpl(original);
        newStack.pop();
        assertEquals("Should be null, as original is affected by the pop() call", original.get(2).getReturnValue(), null);
    }
    
    @Test
    public void testReversedCompareLastObjects() {
        ImprovedStack stacky = new ImprovedStackImpl(createLinkedList());
        ImprovedStack reversed = stacky.reverse();
        assertEquals("Should top() \"StringAtIndex0\"", reversed.top().getReturnValue(), "StringAtIndex0");
    }
    
    @Test
    public void testOriginalStackIsNotAffectedFromReverseMethod() {
        ImprovedStack original = new ImprovedStackImpl(createLinkedList());
        ImprovedStack reversed = original.reverse();
        reversed.pop();
        reversed.pop();
        reversed.pop();
        reversed.pop();
        assertEquals(original.top().getReturnValue(), "OriginalTop");
    }

    @Test
    public void testRemoveTwoElementsNextToEachOther() {
        LinkedList link = new LinkedList();
        link.add(33);
        link.add(33);
        link.add(1);
        ImprovedStack stacky = new ImprovedStackImpl(link);
        stacky.remove(33);
        assertEquals(stacky.size(), 1);
    }
    @Test
    public void testRemoveAllElements() {
        LinkedList link = new LinkedList();
        link.add(33);
        link.add(33);
        link.add(33);
        ImprovedStack stacky = new ImprovedStackImpl(link);
        stacky.remove(33);
        assertEquals(stacky.size(), 0);
    }
    @Test
    public void testRemoveNullObject() {
        String x = null;
        LinkedList link = new LinkedList();
        link.add(33);
        ImprovedStack stacky = new ImprovedStackImpl(link);
        stacky.remove(null);
        assertEquals(stacky.size(), 1);
    }
    
}
