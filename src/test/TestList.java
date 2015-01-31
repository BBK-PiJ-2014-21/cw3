import org.junit.experimental.theories.suppliers.TestedOn;
import src.main.*;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Abstract class to test with JUnit the various implementations of interface {@see List}.
 * All the methods of the interface are tested here, and the classes implementing it 
 * should extend either this or the other test subclass {@see TestFunctionalList} 
 * if they are implementations of that interface, in which case they can be tested in both classes.
 * Some tests methods towards the end of this class use Hamcrest to make comparisons with instances 
 * of other classes (e.g. with {@see StackImpl} implementations). 
 * 
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public abstract class TestList {
    private List list;
    /**
     * This abstract method has to be implemented by each subclass which needs to run this tests.
     * 
     * @return the specific implementation of {@see List}.
     */
    protected abstract List createList();
    /**
     * 
     */
    @Before
    public void setUp() {
        list = createList();
    }
    
    @After
    public void tearDown() {    
        list = null;
    }
    /**
     * This method adds five elements to the list, to be used on various tests.
     */
    public void fiveAdds() {
        list.add("StringAtIndex0");
        list.add(2);
        list.add(3.33);
        list.add("Four");
        list.add(true);
    }
    
    @Test
    public void testEmptyListIsEmpty() {
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testShouldBeEmptyAfterOneAddOneRemove() {
        list.add(1);
        list.remove(0);
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testShouldntBeEmptyAfterTwoAddsAndRemoveLast() {
        fiveAdds();
        list.remove(1);
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testShouldntBeEmptyAfterTwoAddsAndRemoveFirst() {
        list.add("String at index 0");
        list.add(1);
        list.remove(0);
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testSizeAfterFiveAddsOneRemove() {
        fiveAdds();
        list.remove(0);
        assertEquals("Size should be 4", list.size(), 4);
    }
    
    @Test
    public void testSizeAfterFiveAdds() {
        fiveAdds();
        assertEquals("Size should be 5", list.size(), 5);
    }
    
    @Test
    public void testSizeDoesntChangeAfterGet() {
        fiveAdds();
        list.get(0);
        assertEquals("Size should be 5", list.size(), 5);
    }
    
    
    @Test
    public void testRemoveOnEmptyList() {
        assertEquals(list.remove(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void fiveAddsGetFirst() {
        fiveAdds();
        assertEquals(list.get(0).getReturnValue(), "StringAtIndex0");
    }
    
    @Test
    public void testSizeAfterRemovingAllElements() {
        list.add(33);
        list.add(1);
        list.remove(0);
        assertEquals(list.get(0).getReturnValue(), 1);
    }

    @Test
    public void testErrorGetOnEmptyList() {
        list.add("Stringy");
        list.remove(0);
        assertEquals("Should return an EMPTY_STRUCTURE ReturnObject", list.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void testErrorGetOutOfBounds() {
        fiveAdds();
        assertEquals("Should return an INDEX_OUT_OF_BOUNDS", list.get(5).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }
    
    @Test
    public void testGetFirstElement() {
        fiveAdds();
        assertEquals("Should return \"StringAtIndex0\"", list.get(0).getReturnValue(), "StringAtIndex0");
    }
    
    @Test
    public void testGetLastElement() {
        fiveAdds();
        assertEquals("Should return boolean true", list.get(4).getReturnValue(), true);
    }

    @Test
    public void testAddRemoveLastGetLast() {
        fiveAdds();
        list.remove(4);
        assertEquals("Should get an INDEX_OUT_OF_BOUNDS error", list.get(4).getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

    @Test
    public void testAddNullObjectShouldntBeAdded() {
        list.add(null);
        assertEquals("Should get EMPTY_STRUCTURE ReturnObject", list.get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void testAddNullObjectShouldntIncreaseSize() {
        list.add(null);
        assertEquals("Size should be 0", list.size(), 0);
    }
    
    @Test
    public void testAddLinkedListCheckSize() {
        LinkedList toAdd = new LinkedList();
        list.add(toAdd);
        assertEquals("Size should be 1", list.size(), 1);
    }
    
    @Test
    public void testValidAddShouldReturnEmptyReturnObject() {
        fiveAdds();
        assertEquals("Should return null ReturnObject", list.add("Stringy").getReturnValue(), null);
    }
    
    @Test
    public void testValidAddShouldGetNoErrorMessage() {
        assertEquals(list.add(1).getError(), ErrorMessage.NO_ERROR);
    }
    
    @Test
    public void testAddWithIndexOnEmptyList() {
        assertEquals("Should return INDEX_OUT_OF_BOUNDS error", list.add(0, "String at index 0").getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }
    
    @Test
    public void testAddHeadOfList() {
        fiveAdds();
        list.add(0, "NewHead");
        assertEquals("Should return \"NewHead\"", list.get(0).getReturnValue(), "NewHead");
    }
    
    @Test
    public void testSizeAfterAddHeadOfList() {
        fiveAdds();
        list.add(0, "NewHead");
        assertEquals("Size should be 6", list.size(), 6);
    }
    @Test
    public void testAddTailOfList() {
        fiveAdds();
        list.add(4, 555);
        assertEquals("Should return 555", list.get(4).getReturnValue(), 555);
    }
    
    @Test
    public void testSizeAfterAddTailOfList() {
        fiveAdds();
        list.add(4, 555);
        assertEquals("Size should be 6", list.size(), 6);
    }
    
    @Test
    public void testAddNullElementOnValidIndexShouldReturnNull() {
        fiveAdds();
        String nullString = null;
        assertNull(list.add(2, nullString).getReturnValue());
    }
    
    @Test
    public void testAddNullElementOnValidIndexShouldntAffectSize() {
        fiveAdds();
        list.add(3, null);
        assertEquals("Size should be 5", list.size(), 5);
    }
    
    @Test
    public void testRemoveEmptyList() {
        assertEquals(list.remove(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void testRemoveFirstElement() {
        fiveAdds();
        assertEquals("Should remove StringAtIndex0", list.remove(0).getReturnValue(), "StringAtIndex0");
    }
    
    @Test
    public void testRemoveFirstElementCheckSize() {
        fiveAdds();
        list.remove(0);
        assertEquals("Size should be 4", list.size(), 4);
    }
    
    @Test
    public void testRemoveLastElement() {
        fiveAdds();
        assertEquals("Should remove true", list.remove(4).getReturnValue(), true);
    }
    
    @Test
    public void testRemoveLastElementCheckSize() {
        fiveAdds();
        list.remove(4);
        assertEquals("Size should be 4", list.size(), 4);
    }
    
    @Test
    public void testRemoveAllElements() {
        fiveAdds();
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        assertEquals("Size should be 0", list.size(), 0);
    }
    
    @Test
    public void testTenAddsWillCauseArrayListToResize() {
        fiveAdds();
        fiveAdds();
        assertEquals("Size should be 10", list.size(), 10);
    }
    
    @Test
    public void testRemoveOutOfBounds() {
        fiveAdds();
        assertNull(list.remove(5).getReturnValue());
    }
    
    @Test
    public void testHamcrestWorks() {
        assertThat("Stringy", is(equalTo("Stringy")));
    }
    
    @Test
    public void testCompareListWithStackPopOneElement() {
        list.add("String1");
        StackImpl stack = new StackImpl(list);
        assertThat(list.get(0).getReturnValue(), sameInstance(stack.pop().getReturnValue()));
    }
	
}
