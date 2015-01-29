import src.main.*;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * JUnit tests for {@see StackImpl} and {@see ImprovedStackImpl} implementations.
 *
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public class TestStack {
    private LinkedList list;
    private SampleableListImpl sample;
    private FunctionalArrayList funky;
    private StackImpl stack;
    private ImprovedStack improvedStack;
    /**
     * TODO Set up instances for the tests...
     */
    @Before
    public void setUp() {
        
    }
    @Test
    public void testEmptyStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }
    
// TESTS FOR IMPROVEDSTACK() -----------------------------
//TODO different kind of tests when creating different List with stack?
// AND TODO double check internalList of original stack is not affected by reverse() method of copied stack
    @Test
    public void testReversedStackDoesNotAffectOriginal() {
        LinkedList link = new LinkedList();
        link.add(1);
        link.add("Stringy");
        link.add("INDEX2");
        ImprovedStack stack = new ImprovedStackImpl(link);
        ImprovedStack stacky = stack.reverse();
        stacky.pop();
        assertEquals(stack.top().getReturnValue(), "INDEX2");
        assertEquals(stacky.top().getReturnValue(), "Stringy");
    }
    @Test
    public void testRemoveTwoElementssNextToEachOther() {
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
