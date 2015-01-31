import src.main.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Abstract class to test with JUnit the implementations of the interface {@see FunctionalList}.
 * All the extended methods of that interface are tested here. These implementations can also run 
 * the tests in the superclass {@see TestList} regarding the inherited methods of {@see List}.
 *
 * @author federico bartolomei (bbk-pij-2014-21) 
 */
public abstract class TestFunctionalList extends TestList {
    private FunctionalList list;
    /**
     * This abstract method has to be implemented by each subclass which needs to run this tests.
     *
     * @return the specific implementation of {@see FunctionalList}.
     */
    protected abstract FunctionalList createFunkList();
    /**
     * 
     */
    @Before
    public void setUpAndTestList() {
        list = createFunkList();
    }
    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void testHeadOnEmptyList() {
        assertNull(list.head().getReturnValue());
    }
    
    @Test
    public void testRestOnEmptyList() {
        assertEquals(list.rest().get(0).getError(), ErrorMessage.EMPTY_STRUCTURE);
    }
    
    @Test
    public void testHeadOnOneElementList() {
        list.add(1);
        assertEquals("Should return 1", list.head().getReturnValue(), 1);
    }
    
    @Test
    public void testRestOnOneElementList() {
        list.add(1);
        List funky = list.rest();
        assertEquals("Size should be 0", funky.size(), 0);
    }
    
    @Test
    public void testChangesOnHeadShouldNotAffectOriginal() {
        list.add(1);
        list.add(2);
        FunctionalList funky = new FunctionalArrayList();
        funky.add(list.head());
        funky.remove(0);
        assertEquals("Should return 1", list.get(0).getReturnValue(), 1);
    }
    
    @Test
    public void testChangesOnRestShouldNotAffectOriginal() {
        list.add(1);
        list.add("String2");
        list.add(333);
        List funky = list.rest();
        funky.remove(0);
        funky.remove(0);
        assertEquals("Size should be 3", list.size(), 3);
    }
    
    @Test
    public void testRestOfRest() {
        list.add(1);
        list.add(2);
        list.add(3);
        FunctionalList rest1 = list.rest();
        FunctionalList rest2 = rest1.rest();
        assertEquals("Size should be 1", rest2.size(), 1);
    }
    
}
